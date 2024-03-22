package Day7;

import java.util.Scanner;

public class FindMaxInArray {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int i, j, lengthofArray, size;
            size = sc.nextInt();
            int a[] = new int[size];
            lengthofArray = a.length;
            System.out.println("Enter elements in array");
            for (i = 0; i < size; i++) {
                a[i] = sc.nextInt();
            }
            //finding minimum in array
            int minimum = a[0];
            for( i=1; i<lengthofArray; i++ ){
                if(a[i] > minimum){
                    minimum = a[i];
                }
            }
            System.out.println("Minimum element is : " + minimum);
        }
    }
