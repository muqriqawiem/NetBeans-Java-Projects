/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10;

/**
 *
 * @author Muqri Qawiem
 */
public class L10Q4 {

    public static void main(String[] args) {
        int[] arr = {10, 34, 2, 56, 7, 67, 88, 42};
        insertionSort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int k;
            for (k = i - 1; (k >= 0) && (arr[k] > current); k--) {
                arr[k + 1] = arr[k];
            }
            arr[k + 1] = current;
        }
    }
}
