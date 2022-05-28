package Test_Lab1_U2000726;

public class Pet<E> implements Comparable<E>{ //class should implement the Comparable interface as it needs to compare the pets' weights.

    //class should contain the breed, weight and sickness of the pets.
    private E breed;
    private E weight;
    private E sickness;

    //Generate the appropriate getter and setter methods in the class.
    public E getBreed() {
        return breed;
    }
    
    public void setBreed(E breed) {
        this.breed = breed;
    }

    public E getWeight() {
        return weight;
    }
    
    public void setWeight(E weight) {
        this.weight = weight;
    }

    public E getSickness() {
        return sickness;
    }

    public void setSickness(E sickness) {
        this.sickness = sickness;
    }

    @Override
    public int compareTo(E weight) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
