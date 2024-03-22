package BasicProblemsPractice;

import java.util.Scanner;

public class SumOfSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sum Of Series (a+b-c+d-e....n)");
        System.out.println("Enter the number upto which you want to execute the sum?");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (i % 2 == 0) {
                sum = sum - i;
            } else {
                sum = sum + i;
            }

        }
        System.out.println("Sum of " +  num + " numbers in Series is " + sum);
    }
}