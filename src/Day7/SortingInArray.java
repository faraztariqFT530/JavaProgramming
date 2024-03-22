package Day7;

import java.util.Scanner;

public class SortingInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int i, j;
        int a[] = new int[size];
        System.out.println("Enter elements in array");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        //sorting array
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted array:");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}