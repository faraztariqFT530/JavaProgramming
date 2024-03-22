package BasicProblemsPractice;

import java.util.Scanner;

public class DecimalToBinaryNumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Decimal To Binary Number Conversion");
        System.out.println("Enter the Decimal number which you want to convert in Binary?");
        int dec_num = sc.nextInt();
        int actual_num = dec_num;
        int ans = 0; // binary number after conversion
        int pw = 1; //power of 10
        while(dec_num > 0){
            int parity = dec_num % 2;
            ans += (parity * pw);
            pw *= 10;
            dec_num /= 2;
        }
        System.out.println("The binary conversion of the given decimal digit " + actual_num +" is " + ans);
    }
}