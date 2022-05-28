package Test_Lab1_U2000726;

import java.util.ArrayList;

public class Vet {

    String PractitionerName;
    String qualification;

    public Vet(String PractitionerName, String qualification) {
        this.PractitionerName = PractitionerName;
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return PractitionerName;
    }

    public void giveTreatment(ArrayList<Prescription> medication) {
        for(int i = 0; i < medication.size(); i++) {
            System.out.println("Prescription : " + medication);
        }
    }
}
