package TUTO_2;


public class Duo<A,B> { //a generic class named Duo that has two parameters, A and B
    private A first;  //a variable named first of type A
    private B second; //second variable named second of type B

    public Duo(A a, B b) { //a constructor that accepts these two parameters
        first = a; //assign these parameters respectively to the declared variables
        second = b;
    }
    
    public static void main(String[] args){ //Question 6
        Duo<String, Integer> sideShape = new Duo<String, Integer> ("Rectangle",2); //First object called sideShape consist of respectively String type and Integer type
        Duo<Double, Double> points = new Duo<Double, Double> (1.2,3.4); //Second object called points consists of two Double types
    }
}
