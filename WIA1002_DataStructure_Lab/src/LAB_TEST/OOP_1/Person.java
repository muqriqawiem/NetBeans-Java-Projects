/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB_TEST.OOP_1;

/**
 *
 * @author Muqri Qawiem
 */
public class Person {

    private String name;
    private String contactNumber;

    public Person(String name, String contactNumber) {
        this.name = name;
        this.contactNumber = contactNumber;
    }

    public String getName() {
        return name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    @Override
    public String toString() {
        return "Person{"
                + "name='" + name + '\''
                + ", contactNo='" + contactNumber + '\''
                + '}';
    }
}
