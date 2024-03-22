package ArraysCoding;

import java.util.Arrays;
import java.util.Scanner;

class Array {
    static void multiArray() {
        int k;
        System.out.println("Enter the rows of two dimensional arrays");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        System.out.println("Enter the columns of two dimensional arrays");
        int columns = sc.nextInt();
        int [] [] TwoDimArray = new int[rows][columns];
        System.out.println("Enter " + rows + "x" +columns + "=" + (rows*columns) + " integers");
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                TwoDimArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("Here are those " + (rows*columns) + " integers in a " +rows + "x" + columns + " 2d-array");
        System.out.println(Arrays.deepToString(TwoDimArray));

    }

    static void onedArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of names that you want to enter");
        int total_names = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        String [] names = new String[total_names];
        System.out.println("Enter " + total_names + " names one by one");
        for(int i=0; i<names.length; i++){
            names[i] = sc.nextLine();
        }
        System.out.println("The names that you have entered are");
        for(int j=0; j<names.length; j++){
            System.out.println(names[j]);
        }
    }

    static void printSumOfArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want to calculate sum");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
      int array [] = new int[total];
        System.out.println("Enter " + total +" integers that you want to enter in array");
        for(int i=0; i<total; i++){
            array[i] = sc.nextInt();
        }
      int sum =0;
      for(int i=0; i< array.length; i++){
          sum = sum + array[i];
      }
        System.out.println("ArraysCoding.Array sum is " + sum);

    }


    static void printMaximumElementInArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want to calculate maximum");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        int array [] = new int[total];
        System.out.println("Enter " + total +" integers that you want to enter in array");
        for(int i=0; i<total; i++){
            array[i] = sc.nextInt();
        }
        int max =array[0];
        for(int i=0; i< array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println("Maximum number in array is " + max);

    }


    static void printIndexOfElementInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want to find index");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        int array[] = new int[total];
        System.out.println("Enter " + total + " integers that you want to enter in array");
        for (int i = 0; i < total; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number from above numbers which index you want to find in array");
        int number = sc.nextInt();
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Index of required " + number + " number in array is " + index);

        }
        sc.close();
    }


    static void printTotalOccuranceOfElementInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want to find occurance");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        int array[] = new int[total];
        System.out.println("Enter " + total + " integers that you want to enter in array");
        for (int i = 0; i < total; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number which occurance you want to find in the array");
        int number = sc.nextInt();
        int occurance = 0;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                occurance++;
            }
        }
        if (occurance == 0) {
            System.out.println("Not found");
        } else {
            System.out.println("Occurance of required " + number + " number in array is " + occurance);

        }
        sc.close();
    }



    static void printLastIndexOccuranceOfElementInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want to find occurance");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        int array[] = new int[total];
        System.out.println("Enter " + total + " integers that you want to enter in array");
        for (int i = 0; i < total; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the number which occurance you want to find in the array");
        int number = sc.nextInt();
        int lastOccurance = -1;
        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                lastOccurance = i;
            }
        }
        if (lastOccurance == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Occurance of required " + number + " number in array is " + lastOccurance);

        }
        sc.close();
    }

    static void CheckIfArrayIsSortedOrNot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want to check whether if the array is sorted or not");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        int array[] = new int[total];
        System.out.println("Enter " + total + " integers that you want to enter in array");
        for (int i = 0; i < total; i++) {
            array[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > array[i+1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("ArraysCoding.Array is sorted");
        } else {
            System.out.println("Given array is not sorted");
        }
        sc.close();
    }

    static void SmallestAndLargestElementInArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array that you want");
        int total = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        int array[] = new int[total];
        System.out.println("Enter " + total + " integers that you want to enter in array");
        for (int i = 0; i < total; i++) {
            array[i] = sc.nextInt();
        }
        //ArraySort
        Arrays.sort(array);
        int [] ans = {array[0], array[array.length-1]};
        System.out.println("Smallest element is " + ans[0]);
        System.out.println("Largest element is " + ans[1]);
        sc.close();
    }

    public static void main(String[] args) {
      //  multiArray();
      //  onedArray();
      //  printSumOfArray();
     //   printMaximumElementInArray();
     //   printIndexOfElementInArray();
     //   printTotalOccuranceOfElementInArray();
     //   printLastIndexOccuranceOfElementInArray();
     //   CheckIfArrayIsSortedOrNot();
        SmallestAndLargestElementInArray();
    }
}
