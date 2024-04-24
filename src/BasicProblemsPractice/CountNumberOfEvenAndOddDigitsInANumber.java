package BasicProblemsPractice;

import java.util.Scanner;

public class CountNumberOfEvenAndOddDigitsInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find even and odd digits");
        int num = sc.nextInt();
        int org_num = num;
        int oddnum = 0;
        int evennum = 0;
        while(num >0){
            int rem = num % 10;
            if(rem %2 ==0){
                evennum++;
            }
            else {
                oddnum++;
            }
            num = num / 10;
        }
        System.out.println("Number of odd digits in " + org_num + " is " + oddnum + " and even digits are " + evennum);
    }
}
