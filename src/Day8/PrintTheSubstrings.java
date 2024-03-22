package Day8;

import java.util.Scanner;

public class PrintTheSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        System.out.println("Enter the string which substrings you want to print ");
        st = sc.nextLine();
        for(int i=0; i<st.length(); i++){
            for(int j=i+1; j<=st.length(); j++){
                System.out.println(st.substring(i,j));
            }
        }
    }
}
