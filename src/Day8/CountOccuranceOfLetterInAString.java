package Day8;
import java.util.Scanner;
public class CountOccuranceOfLetterInAString {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String original;
    char ch;
    int occurance=0;
        System.out.println("Enter the string for which you want to find occurance: ");
        original = sc.nextLine();
        System.out.println("Enter the character which occurance you want to find in input you have provided: " + original);
        ch = sc.next().charAt(0);
        for(int i=0; i<=original.length()-1; i++){
        if(original.charAt(i)==ch){
            occurance++;
        }
    }
        System.out.println("Occurance of character : " + ch + " is " + occurance);
}
}
