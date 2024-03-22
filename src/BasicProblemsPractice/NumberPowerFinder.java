package BasicProblemsPractice;

import java.util.Scanner;

public class NumberPowerFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which power you want to find");
        int num = sc.nextInt();
        System.out.println("Enter the number for which many times you want to find power");
        int power = sc.nextInt();
        int calculatedPower = 1;
        for(int i=1; i<=power; i++)
        {
            calculatedPower = calculatedPower * num;
        }
        System.out.println("Calculated Power of the given number " + num + " is " + calculatedPower);
    }
}
