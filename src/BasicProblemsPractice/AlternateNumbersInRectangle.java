package BasicProblemsPractice;

import java.util.Scanner;

public class AlternateNumbersInRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Alternate Numbers In Rectangle");
        System.out.println("Enter the number of rows in the rectangle");
        int r = sc.nextInt();
        System.out.println("Enter the number of columns in the rectangle");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0){
                    System.out.print(1);
            }
                else {
                    System.out.print(2);
                }
            }
            System.out.println();
        }
    }
}