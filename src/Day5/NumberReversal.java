package Day5;

import java.util.Scanner;

public class NumberReversal {
    public static void main(String[] args) {
        int rev_num = 0;
        System.out.println("Reverse Digit Of Numbers");
        System.out.println("Enter the number which you want to reverse?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int OriginalNum = num;
        while(num >0) {
           rev_num = rev_num * 10 + num % 10;
           num = num /10;
        }
        System.out.println("Reverse digit of " + OriginalNum + " is " + rev_num);
    }
}
