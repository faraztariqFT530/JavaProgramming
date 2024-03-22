package ArraysCoding;

import java.util.Scanner;

public class FindMaximumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements");
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int max = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > max) {
                max = a[i]; // Update max if current element is greater
            }
        }
        System.out.println("Maximum element in the array: " + max);
    }
}
