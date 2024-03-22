package BasicProblemsPractice;

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Factorial Calculator");
        System.out.println("Enter the number which factorial you want to find?");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact *i;
            System.out.println("Factorial of " + i + " is " + fact);
        }

        //If you want to print the factorial of a specific number
        System.out.println("Factorial of " + num + " is " + fact);
        }
    }