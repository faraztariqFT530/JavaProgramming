package BasicProblemsPractice;

import java.util.Scanner;

public class NumberPalindromeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which for which you want to find palindrome status");
        int num = sc.nextInt();
        int Org_num = num;
        int rev =0;
        while (num !=0){
            rev = rev  * 10 + num %10;
            num = num / 10;
        }
        if(Org_num == rev){
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not a palindrome");
        }
    }
}
