package BasicProblemsPractice;

import java.util.Scanner;

public class FindSumOfDigitsForGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find Sum Of Digits For Given Number");
        System.out.println("Enter the number for which you have to find the sum?");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            sum +=num % 10;
            num = num /10;
        }
        System.out.println("Sum of digits in " + originalNum + " is " + sum);
    }
}