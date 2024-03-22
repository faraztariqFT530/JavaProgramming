package ArraysCoding;

import java.util.Scanner;

public class FindMinimumElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements");
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] < min) {
                min = a[i]; // Update min if current element is greater
            }
        }
        System.out.println("Minimum element in the array: " + min);
    }
    }
 
