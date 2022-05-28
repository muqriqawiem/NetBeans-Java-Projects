package LAB_7;

import java.util.Scanner;

public class q2 {

    public static void main(String[] args) {
        MyQueue<Character> q = new Linkedlist();
        
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a string: ");
        String text  = s.nextLine();
        
        for(int i = 0; i < text.length(); i++){
            q.offer(text.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = text.length()-1; i>=0; i--){
            if(text.charAt(i) != q.poll()) isPalindrome = false;
        }
        System.out.println("The text %s is palindrome: %b\n", text, isPalindrome);
    }
    
}
