package Patterns;

import java.util.Scanner;

public class ReverseTrianglePrintingPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Triangle Printing Pattern");
        System.out.println("Enter the number of rows in the Triangle");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= (r+1-i); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
public class Patterns.ReverseTrianglePrintingPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Triangle Printing Pattern");
        System.out.println("Enter the number of rows in the Triangle");
        int r = sc.nextInt();
        for(int i = r; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/
