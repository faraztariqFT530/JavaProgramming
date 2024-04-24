package StringProblems;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the string which you want to check palindrome");
        String original = sc.nextLine();
        String reversed = "";
        for(int i=original.length()-1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        System.out.println("Reverse of the string is " + reversed);
        if(original.equals(reversed)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
