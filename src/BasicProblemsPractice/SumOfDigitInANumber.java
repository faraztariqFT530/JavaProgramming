package BasicProblemsPractice;
import java.util.Scanner;
public class SumOfDigitInANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which you want to find sum of digits of that number");
        int num = sc.nextInt();
        int org_num = num;
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num /10;
        }
        System.out.println("Sum of digits in the number " + org_num + " is " + sum);
    }
}
