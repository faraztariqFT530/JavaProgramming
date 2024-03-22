package BasicProblemsPractice;

import java.util.Scanner;
public class SwappingTwoNumbersWithoutUsingThirdVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping Two Numbers");
        System.out.println("Enter first number");
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Numbers before Swapping are " + num1 + " and " + num2 );
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("Numbers After Swapping are " + num1 + " and " + num2 );
    }
}