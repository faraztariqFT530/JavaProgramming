package StringProblems;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the string which you want to reverse");
        String original = sc.nextLine();
        String reversed = "";
        int lengthofString = original.length();
        for(int i =lengthofString-1; i>=0; i--){
            reversed = reversed + original.charAt(i);
        }
        System.out.println(reversed);
    }
}
