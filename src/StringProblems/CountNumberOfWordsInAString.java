package StringProblems;

import java.util.Scanner;

public class CountNumberOfWordsInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in which you want to count numbers");
        String str = sc.nextLine();
        str = str.trim();

        String[] words = str.split("\\s");
        int wordscount = words.length;
        System.out.println("Number of words: " + wordscount);
    }
}
