package BasicProblemsPractice;

import java.util.Scanner;

public class CountNumberOfDigitsInANumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number which you want to reverse");
            int num = sc.nextInt();
            int Original_num = num;
            int count = 0;
            while (num > 0 ){
                num = num /10;
                count++;
            }
        System.out.println("Number of digits in " + Original_num + " are " + count);
    }
}
