package Day7;

import java.util.Scanner;

public class PrintElementsOfArrayInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int i, j;
        int a[] = new int[size];
        System.out.println("Enter elements in array");
        for (i = 0; i < size; i++) {
            System.out.println("Enter element in array for " + (i + 1) + " position");
            a[i] = sc.nextInt();
        }
        //reversing array
        System.out.println("Reversed array:");
        for( i=a.length-1; i>=0; i--){
            System.out.print(a[i] + " ");
        }
    }
}
