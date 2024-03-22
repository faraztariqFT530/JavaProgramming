package BasicProblemsPractice;

import java.util.Scanner;
public class CountNumberOfDigitsForGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Count Number Of Digits For Given Number");
        System.out.println("Enter the number for which you have to find digits?");
        int num = sc.nextInt();
        int originalNum = num;
        int numOfDigits=0;

        while(num > 0){
            num = num/10;
            numOfDigits++;
        }
        System.out.println("Number of digits in " + originalNum + " are " + numOfDigits);
    }
}