package ArraysCoding;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        String array[] = new String [size];
        System.out.println("Enter the total " + size + " names (single words)");
        for(int i=0; i<size; i++){
            array[i] = sc.next();
        }
        for(int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}
