package BasicProblemsPractice;

import java.util.Scanner;

public class QuotientAndRemainderFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quotient = 0;
        System.out.println("Enter first number ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number ");
        int num2 = sc.nextInt();
       //Formula for finding quotient
        System.out.println("Quotient is " + (num1/num2));
        //Formula for finding Remainder
        System.out.println("Remainder is " + (num1%num2));
    }
}
