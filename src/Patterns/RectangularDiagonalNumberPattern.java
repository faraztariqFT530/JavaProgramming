package Patterns;

import java.util.Scanner;

public class RectangularDiagonalNumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangular Diagonal Number Pattern");
        System.out.println("Enter the number of rows in the Rectangule");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            //print i to j numbers
            for(int j = i; j <= r; j++){
                System.out.print(j);
            }
            //print i-1 numbers
            for(int k = 1; k <= i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}

