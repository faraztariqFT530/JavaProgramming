package BasicProblemsPractice;

import java.util.Scanner;

public class SumOfEvenNumberInSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum of even numbers Finder");
        System.out.println("Enter the numbers upto which you want to find sum of even numbers");
        int totalNumbers = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= totalNumbers; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of given " + totalNumbers + " even number is " + sum);
    }
}
