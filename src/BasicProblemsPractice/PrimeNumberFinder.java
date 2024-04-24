package BasicProblemsPractice;
import java.util.Scanner;

//natural number >1
//has only two factors i.e. 1 and the number itself
//19 => 1 and 19 => prime number

public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find if it is prime or not");
        int num = sc.nextInt();
        int org_num = num;
        int count = 0;
        boolean isPrime = false;
        if(num>1) {
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    System.out.println("Number " + org_num + " is a prime number");
                }
                else {
                    System.out.println("Number " + org_num + " is not a prime number");
                }
        }
            else{
                System.out.println("Number " + org_num + " is not a prime number");
            }
        }
    }

