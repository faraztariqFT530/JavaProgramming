package Patterns;

import java.util.Scanner;

public class HollowTriangleNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hollow Triangle Number Pattern");
        System.out.println("Enter the number of rows in the Triangle");
        int r = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            // print r-i spaces
            for (int j = 1; j <= (r - i); j++) {
                System.out.print(" ");
            }
            // print 1 to 2*i-1 numbers
            for (int k = 1; k <= 2 * i - 1; k++) {
                // print i at the beginning and end of the row
                if (k == 1 || k == 2 * i - 1 || i == r) {
                    System.out.print(i);
                } else {
                    // print space for the hollow part
                    System.out.print(" ");
                }
            }
            // move to the next line after completing a row
            System.out.println();
        }
    }
}