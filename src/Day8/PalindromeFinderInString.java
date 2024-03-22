package Day8;

import java.util.Scanner;

public class PalindromeFinderInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original, reverse = "";
        System.out.println("Enter the string which palindrome you want to find: ");
        original = sc.nextLine();
        System.out.println("Original string is: " + original);
        for(int i=original.length()-1; i>=0; i--){
            reverse = reverse + original.charAt(i);
        }
        if(original.equals(reverse)){
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
    }

