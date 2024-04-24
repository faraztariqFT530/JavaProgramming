package StringProblems;

import java.util.Scanner;

public class SubstringCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string in which you want to find the substring");
        String str = sc.nextLine();
        System.out.println("Enter the substring which you want to find in above string");
        String substr = sc.nextLine();
        int count =0;
        int index =0;
        while((index = str.indexOf(substr, index )) !=-1){
            count++;
            index = index + substr.length();
        }
        System.out.println("Count of substring " + substr + " is : " + count);

    }

}
