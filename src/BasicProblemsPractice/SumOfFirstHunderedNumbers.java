package BasicProblemsPractice;

import java.util.Scanner;

public class SumOfFirstHunderedNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to find sum");
        int num = sc.nextInt();
        int sumOfSeries = 0;
        for(int i=1; i<=num; i++){
            sumOfSeries +=i;
        }
        System.out.println("Calculated sum of the series upto given num " + num + " is " + sumOfSeries);
    }
}
