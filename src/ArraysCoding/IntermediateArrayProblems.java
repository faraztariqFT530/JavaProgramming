package ArraysCoding;

import java.util.Scanner;

public class IntermediateArrayProblems {

    static int pairSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    ans++;
                }
            }
        }
        return ans;
    }

    static int pairSumTriplet(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for(int k=j+1; k<n; k++)
                if (arr[i] + arr[j] +arr[k]== target) {
                    ans++;
                }
            }
        }
        return ans;
    }


    static int findUniqueInArray(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans =-1;
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                ans = arr[i];
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " Elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

       // System.out.println("Enter targeted sum");
       // int target = sc.nextInt();

        //System.out.println(pairSum(arr, target));
        //System.out.println(pairSumTriplet(arr, target));
        System.out.println("Unique Element in this array is: " + findUniqueInArray(arr));
    }
}