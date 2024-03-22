package ArraysCoding;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("ArraysCoding.Array before reversing is: ");
        for(int j=0; j<n; j++){
            System.out.println(array[j]);
        }

        System.out.println("ArraysCoding.Array after reversing is: ");
        for(int k = n-1 ; k >= 0; k--){
            System.out.println(array[k]);
        }
    }
}