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

public class FashionStore extends ShopLot implements Comparable<FashionStore> {

    private ArrayList<Item> clothes;

    public FashionStore(String shopName, Person contactPerson) {
        super(shopName, contactPerson);
        this.clothes = new ArrayList<>();
    }

    public void addClothes(String clothesName, int clothesPrice) {
        clothes.add(new Item(clothesName, clothesPrice));
    }

    @Override
    public int compareTo(FashionStore fashionStore) {
        if (super.getNumOfEmployees() > fashionStore.getNumOfEmployees()) {
            return 1;
        } else if (super.getNumOfEmployees() < fashionStore.getNumOfEmployees()) {
            return -1;
        }
        return 0;
    }

    @Override
    public ArrayList<Item> getItems() {
        return clothes;
    }
}
