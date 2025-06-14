/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_TEST.OOP_1;

/**
 *
 * @author Muqri Qawiem
 */
import java.util.ArrayList;

public class FoodStore extends ShopLot implements Comparable<FoodStore> {

    private ArrayList<Item> menu;

    public FoodStore(String shopName, Person contactPerson) {
        super(shopName, contactPerson);
        this.menu = new ArrayList<>();
    }

    @Override
    public int compareTo(FoodStore foodStore) {
        if (super.getNumOfEmployees() > foodStore.getNumOfEmployees()) {
            return 1;
        } else if (super.getNumOfEmployees() < foodStore.getNumOfEmployees()) {
            return -1;
        }
        return 0;
        //return Integer.compare(super.getNumOfEmployees(), foodStore.getNumOfEmployees());
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof FoodStore) {
            return (super.getContactPerson().getName()).equals(((FoodStore) obj).getContactPerson().getName());
        }
        return false;
    }

    public void addMenu(String foodName, int foodPrice) {
        menu.add(new Item(foodName, foodPrice));
    }

    @Override
    public ArrayList<Item> getItems() {
        return menu;
    }
}
