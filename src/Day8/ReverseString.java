package Day8;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original, reverse = "";
        System.out.println("Enter the string which reverse you want to find: ");
        original = sc.nextLine();
        System.out.println("Original string is: " + original);
        for(int i=original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse string is: " + reverse);
    }
}
