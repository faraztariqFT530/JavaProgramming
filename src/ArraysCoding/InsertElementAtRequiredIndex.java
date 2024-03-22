package ArraysCoding;

import java.util.Scanner;

public class InsertElementAtRequiredIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the position in which you want to insert " + a.length);
        int position = sc.nextInt();
        System.out.println("Enter the element which you want to insert in that position ");
        int element = sc.nextInt();


    }
}
