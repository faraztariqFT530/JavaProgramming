package Patterns;

import java.util.Scanner;

public class RectanglePrintingPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangle Printing Pattern");
        System.out.println("Enter the number of rows in the rectangle");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in the rectangle");
        int c = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}