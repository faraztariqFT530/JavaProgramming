package Day5;

import java.util.Scanner;

public class CountNumberOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String str = "Stringisthe";
       String rev = "";
       int lengthofstring = str.length();
       for(int i=lengthofstring-1; i>=0; i--){
           rev = rev + str.charAt(i);
       }
        System.out.println(rev);
    }
}
