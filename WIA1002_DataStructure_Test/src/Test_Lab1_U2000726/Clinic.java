package Test_Lab1_U2000726;


public class Clinic extends Vet {
    
    //a getter method to retrieve the Vet object that contains the practitioner information.
    public String getPractitionerName() {
        return PractitionerName;
    }

    public String getQualification() {
        return qualification;
    }

    public static void main(String[] args) {
    }

    public Clinic(String PratitionerName, String qualification) {
        super(PratitionerName, qualification);
    }
       
}
