/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_5;

/**
 *
 * @author Muqri Qawiem
 */
public class DNode<E> {

    E element;
    DNode<E> next;
    DNode<E> prev;

    public DNode(E element) {
        this(element, null, null);
    }

    public DNode(E element, DNode<E> next, DNode<E> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }
}
