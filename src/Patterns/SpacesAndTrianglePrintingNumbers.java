package Patterns;

import java.util.Scanner;

public class SpacesAndTrianglePrintingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Spaces And Triangle Printing Numbers");
        System.out.println("Enter the number of rows in the Triangle");
        int r = sc.nextInt();
        for(int i = 1; i <= r; i++){
            //print r-i spaces
            for(int j = 1; j <= (r-i); j++){
                System.out.print(" ");
            }
            //print 1 to i numbers
            for(int k = 1; k <= i; k++){
                System.out.print(k);
            }
            //print i-1 to 1 numbers
            for(int l = i-1; l >=1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
