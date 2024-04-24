package ArraysCoding;

import java.util.Scanner;

public class MissingNumbersInArray {
    public static void main(String[] args) {
        int size1,size2;
        Scanner sc = new Scanner(System.in);
        //first array
        System.out.println("How many elements you want to enter in the first array");
        size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the array elements which you want to find missing elements");
        System.out.println("Enter " + size1 + " Elements");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }
    }
}
