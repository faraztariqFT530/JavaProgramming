package BasicProblemsPractice;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year which you want to find if leap or not?");
        int year = sc.nextInt();
        {
        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");
        }

    }
}