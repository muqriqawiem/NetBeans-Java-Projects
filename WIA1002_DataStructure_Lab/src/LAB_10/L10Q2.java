/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_10;

/**
 *
 * @author Muqri Qawiem
 */
public class L10Q2 {

    public void selectionSortLargest(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int currentLargestIndex = i;
            int currentLargest = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > currentLargest) {
                    currentLargestIndex = j;
                    currentLargest = arr[j];
                }
            }

            if (currentLargestIndex != i) {
                arr[currentLargestIndex] = arr[i];
                arr[i] = currentLargest;
            }
        }
    }
}
