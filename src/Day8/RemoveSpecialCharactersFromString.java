package Day8;

import java.util.Scanner;

public class RemoveSpecialCharactersFromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String org_st,  rem_st= " ";
        System.out.println("Enter the string which words you want to remove white spaces");
        org_st = sc.nextLine();
        // Remove special characters using regular expression
        rem_st = org_st.replaceAll("[^a-zA-Z0-9\\s]", "");
        System.out.println("String with special characters is : " + org_st);
        System.out.println("String without special characters is : " + rem_st);


    }
}
