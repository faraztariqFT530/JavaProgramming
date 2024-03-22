package ArraysCoding;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FiveFloatsum {
    public static void main(String[] args) {
        float sum=0;
        Scanner sc = new Scanner(System.in);
        float arr [] = new float[5];
        System.out.println("Enter the 5 float values ");
        for(int i=0; i<arr.length; i++){
            try {
                arr[i] = sc.nextFloat();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a float value.");
                sc.nextLine(); // Clear the input buffer
                i--; // Retry for the same index
            }
        }
        for(int i=0; i<arr.length; i++){
            sum= sum + arr[i];
        }

        System.out.println("Sum of 5 float is"  + sum);

    }
}
