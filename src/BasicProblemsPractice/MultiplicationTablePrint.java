package BasicProblemsPractice;

import java.util.Scanner;

public class MultiplicationTablePrint {
    public static void main(String[] args) {
        int i, answer = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number which table you want to print");
        int num1 = sc.nextInt();
        for (i = 1; i <= 10; i++)
        {
            answer = num1 * i ;
            System.out.println(num1 + "X" +  i +"="+ answer);
        }
    }
}
