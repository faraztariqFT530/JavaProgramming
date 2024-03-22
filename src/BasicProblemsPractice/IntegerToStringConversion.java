package BasicProblemsPractice;

import java.util.Scanner;

public class IntegerToStringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Integer To String Conversion");
        int a = 12345;
        String str = Integer.toString(a);
        System.out.println(str.length());  // print the length of the given string
        System.out.println(str.charAt(0));  // print first character of string
    }
}