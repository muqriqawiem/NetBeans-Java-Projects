package TUTO_1;

public class MainTelephone {


    public static void main(String[] args) {
        // TODO code application logic here
        Telephone [] phoneArray = new Telephone [5];
        int number = 7967300;
        
        for(int i = 0;i <  5;i++){
            phoneArray[i] = new Telephone("03",number++);
        }
        
        for(int i = 0;i <  5;i++){
            System.out.println(phoneArray[i].makeFullnumber());
        }
        
        
    }
    
}
