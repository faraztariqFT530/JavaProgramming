package BasicProblemsPractice;

import java.util.Scanner;
public class ReverseDigitOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Reverse Digit Of Numbers");
        System.out.println("Enter the number which you want to reverse?");
        int num = sc.nextInt();
        int originalNum = num;
        int ans=0;

        while(num > 0){
            ans = ans * 10 + num % 10;
            num /=10;
        }
        System.out.println("Reverse digit of " + originalNum + " is " + ans);

}
}