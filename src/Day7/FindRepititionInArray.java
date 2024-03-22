package Day7;

import java.util.Scanner;

public class FindRepititionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();
        int i;
        int duplicate = 0;
        int a[] = new int[size];
        System.out.println("Enter elements in array");
        for(i=0; i<size; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number which you want to find duplicate in array");
        int numbertofind=sc.nextInt();
        for(int j=0; j<size; j++){
        if(a[j] == numbertofind){
            duplicate++;
        }
        }
        System.out.println("Duplication of this number is " + duplicate + " times");
    }
}
