package Day7;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;

        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter " + size + " Elements in array");
        for(i=0; i<size; i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the element which you want to search in array?");
        int element = sc.nextInt();
        boolean found = false;
        for( i=0; i<size; i++){
           if (a[i] == element){
               found = true;
           }
        }
            if (found) {
                System.out.println("Element found");
            } else {
                System.out.println("Element not found in array");
        }
    }
}
