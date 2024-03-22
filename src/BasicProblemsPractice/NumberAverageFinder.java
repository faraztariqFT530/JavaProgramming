package BasicProblemsPractice;

import java.util.Scanner;

public class NumberAverageFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Average Finder");
        System.out.println("Enter the numbers for which you want to find average");
        int totalNumbers = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=totalNumbers; i++){
            System.out.print("Enter number " + i + ": ");
            sum += sc.nextInt();
        }
        double average = (double) sum / totalNumbers;

        System.out.println("Average of the " + totalNumbers + " numbers is: " + average);

        sc.close();
    }
}
