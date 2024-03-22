package BasicProblemsPractice;

import java.util.Scanner;

public class BinaryToDecimalNumberConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary To Decimal Number Conversion");
        System.out.println("Enter the Binary number which you want to convert in Decimal?");
        int bin_num = sc.nextInt();
        int actual_num = bin_num;
        int ans = 0; //converted decimal number
        int pw = 1;  // 2 ^ 0 = 1
        while (bin_num >0){
            int unit_digit = bin_num % 10;
            ans +=(unit_digit *pw);
            bin_num /= 10;
            pw *= 2;
        }
        System.out.println("The decimal conversion of the given binary digit " + actual_num +" is " + ans );
    }
}