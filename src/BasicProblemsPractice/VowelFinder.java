package BasicProblemsPractice;

import java.util.Scanner;

public class VowelFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character");
        char character = sc.next().charAt(0);
        boolean isVowel = false;
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                isVowel = true;

        }
        if (isVowel) {
            System.out.println("Character is wovel");
        } else {
            System.out.println("Character is not a wovel");
        }
    }
}