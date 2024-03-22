package Patterns;

import java.util.Scanner;

public class SpacesAndTriangleNumberPattern {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Spaces And Triangle Printing");
            System.out.println("Enter the number of rows in the Triangle");
            int r = sc.nextInt();
            for(int i = 1; i <= r; i++){
                //print r-i spaces
                for(int j = 1; j <= (r-i); j++){
                    System.out.print(" ");
                }
                //print 2(i-1) stars
                for(int k = 1; k <= 2*i-1; k++){
                    System.out.print(k);
                }
                System.out.println();
            }
        }
    }

