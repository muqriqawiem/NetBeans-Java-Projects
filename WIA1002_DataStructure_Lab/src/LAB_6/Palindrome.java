/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_6;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Muqri Qawiem
 */
public class Palindrome {

    public static void main(String[] args) {
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a string: ");
            String before = scanner.nextLine();

            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < before.length(); i++) {
                stack.push(before.charAt(i));
            }

            String after = "";
            while (!stack.isEmpty()) {
                after += stack.pop().toString();
            }

            if (before.equalsIgnoreCase(after)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not a palindrome");
            }
        }
    }
}
