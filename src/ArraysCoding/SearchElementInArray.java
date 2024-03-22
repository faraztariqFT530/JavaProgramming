package ArraysCoding;

import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        System.out.println("Enter " + size + " elements");
        int a[] = new int[size];
        for(int i=0; i<a.length; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Input the integer which you want to search in the array");
        int number = sc.nextInt();
        boolean found = false;
        for(int i=0; i<a.length; i++){
            if(number == a[i]){
                found = true;
                break;
            }
            else found = false;
        }
        if(found == true){
            System.out.println("Element is found");
        }
        else  {
            System.out.println("Element is not found");
        }
    }
}
