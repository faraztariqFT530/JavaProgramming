package Day7;

import java.util.Scanner;

public class MissingElementsInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int i, j, lengthofArray, size;
        size = sc.nextInt();
        int a[] = new int[size];
        lengthofArray = a.length;
        System.out.println("Enter elements in array from 1 to 10");
        for (i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }


    }
}
