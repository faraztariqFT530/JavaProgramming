package Patterns;

import java.util.Scanner;

public class RectangleNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangle Number Pattern");
        System.out.println("Enter the number of rows in the rectangle");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in the rectangle");
        int c = sc.nextInt();
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
