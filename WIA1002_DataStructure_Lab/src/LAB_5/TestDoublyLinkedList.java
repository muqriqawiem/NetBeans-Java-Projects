/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

/**
 *
 * @author Muqri Qawiem
 */
public class TestDoublyLinkedList {

    public static void main(String[] args) {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedList<>();

        doublyLinkedList.addFirst(1);
        doublyLinkedList.addLast(10);
        doublyLinkedList.add(2, 2);
        doublyLinkedList.addLast(100);
        doublyLinkedList.remove(3);

        System.out.println();
        doublyLinkedList.traverseForward();
        doublyLinkedList.traverseBackward();

        System.out.println("size of current Doubly Linked List: " + doublyLinkedList.getSize());

        doublyLinkedList.clear();

        System.out.println("\nsize of current Doubly Linked List: " + doublyLinkedList.getSize());
    }
}
