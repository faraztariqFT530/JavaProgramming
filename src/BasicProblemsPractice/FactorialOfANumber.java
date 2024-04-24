package BasicProblemsPractice;
import java.util.Scanner;
public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for which you want to find factorial");
        int num = sc.nextInt();
        int org_num = num;
        long factorial = 1;
        for(int i=num; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println("Factorial of the given number " + org_num + " is " + factorial);
    }
}
