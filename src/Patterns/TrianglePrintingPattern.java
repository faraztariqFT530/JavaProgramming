package Patterns;

import java.util.Scanner;

public class TrianglePrintingPattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Triangle Printing Pattern");
            System.out.println("Enter the number of rows in the Triangle");
            int r = sc.nextInt();
            for(int i = 1; i <= r; i++){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }

