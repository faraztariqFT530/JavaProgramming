package ArraysCoding;

import java.util.Scanner;

public class AverageOfAnArrayUsingForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements");
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        int sum =0;
        for (int num : a) {
            sum=sum + num;
        }

        double average = (double) sum / size; // Calculating average
        System.out.println("Average of the elements in the array: " + average);

    }
}
