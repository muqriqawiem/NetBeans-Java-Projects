package TUTO_1;

public class Telephone {
    private String areaCode;
    private int number;
    private static int numberOfTelephoneObject = 0;

    public Telephone(String areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
        numberOfTelephoneObject++;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public String makeFullnumber(){
        return areaCode + " - " + number;
    }
}
