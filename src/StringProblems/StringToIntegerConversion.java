package StringProblems;

import java.util.Scanner;

public class StringToIntegerConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String To Integer Conversion");
        String str = "Faraz"; // This string can't be converted to integer
        String str1 = "98";
        System.out.println(str1+1);  // Output will be 981
        int num = Integer.parseInt(str1);
        System.out.println(num+1);  // Output will be 99
    }
}