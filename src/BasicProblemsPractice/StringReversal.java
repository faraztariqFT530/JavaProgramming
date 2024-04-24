package BasicProblemsPractice;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to reverse");
        String word = sc.nextLine();
        String reversed = "";
        for(int i=word.length()-1; i>=0; i--){
            reversed = reversed + word.charAt(i);
        }
        System.out.println("Reverse of the " + word + " is " + reversed);
    }
}
