/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_7;

/**
 *
 * @author Muqri Qawiem
 */
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String before = scanner.nextLine();

            MyQueue<Character> queue = new MyQueue<>();
            for (int i = before.length() - 1; i >= 0; i--) {
                queue.enqueue(before.charAt(i));
            }

            String after = "";
            while (!queue.isEmpty()) {
                after += queue.dequeue().toString();
            }

            if (before.equalsIgnoreCase(after)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }
}
