/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_9;

/**
 *
 * @author Muqri Qawiem
 */
public class Exponent {

    public static void main(String[] args) {
        System.out.println(exponent(10, 3));
        System.out.println(exponent(2, 8));
        System.out.println(exponent(5, 3));
    }

    public static long exponent(int x, int m) {
        // Base case
        if (m == 0) {
            return 1;
        }
        // Recursive case
        return (x * exponent(x, --m));
    }
}
