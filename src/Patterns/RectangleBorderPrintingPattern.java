package Patterns;

import java.util.Scanner;
public class RectangleBorderPrintingPattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Rectangle Border Printing Pattern");
            System.out.println("Enter the number of rows in the rectangle");
            int r = sc.nextInt();
            System.out.println("Enter the number of columns in the rectangle");
            int c = sc.nextInt();
            for(int i = 1; i <= r; i++){
                for(int j = 1; j <= c; j++){
                    if(i==1 || i==r || j==1 || j==c)
                    System.out.print("*");
                    else
                        System.out.print(" ");
            }
                System.out.println();
        }
    }
}
