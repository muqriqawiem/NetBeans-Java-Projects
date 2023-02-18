/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9;

/**
 *
 * @author Muqri Qawiem
 */
public class SubstituteAI {

    public static void main(String[] args) {
        System.out.println(substituteAI("flabbergasted"));
        System.out.println(substituteAI("Astronaut"));
    }

    public static String substituteAI(String word) {
        // base case: string length == 0
        if (word.length() < 1) {
            return "";
        }
        // Recursive case
        char letter = word.charAt(0);
        String remaining = word.substring(1);  // slice the string
        if (letter == 'a') {
            return "i" + substituteAI(remaining);
        }
        return letter + substituteAI(remaining);
    }
}
