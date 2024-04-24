package ArraysCoding;

import java.util.Scanner;

public class FindTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        int size1,size2;
        Scanner sc = new Scanner(System.in);
        //first array
        System.out.println("How many elements you want to enter in the first array");
        size1 = sc.nextInt();
        int arr1[] = new int[size1];
        System.out.println("Enter the first array which you want to compare");
        System.out.println("Enter " + size1 + " Elements");
        for (int i = 0; i < size1; i++) {
            arr1[i] = sc.nextInt();
        }

        //second array
        System.out.println("How many elements you want to enter in the second array");
        size2 = sc.nextInt();
        int arr2[] = new int[size2];
        System.out.println("Enter the second array which you want to compare");
        System.out.println("Enter " + size2 + " Elements");

        boolean status = true;
        for (int i = 0; i < size2; i++) {
            arr2[i] = sc.nextInt();
        }
        if(arr1.length ==arr2.length){
            for(int i=0; i<arr1.length; i++){
                if(arr1[i] != arr2 [i])
                {
                    status = false;
                }
            }
        }
        else {
            status = true;
        }
        if(status == true){
            System.out.println("Arrays are equal");
        }
        else {
            System.out.println("Arrays are not equal");
        }
    }
}
