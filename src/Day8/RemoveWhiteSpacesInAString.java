package Day8;

import java.util.Scanner;

public class RemoveWhiteSpacesInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String org_st, rem_st = " ";
        System.out.println("Enter the string which words you want to remove white spaces");
        org_st = sc.nextLine();
        for(int i=0; i<org_st.length(); i++){
            if( (org_st.charAt(i) != ' ') )
            {
                rem_st += org_st.charAt(i);
            }
        }
        System.out.println("String with white spaces is : " + org_st);
        System.out.println("String without white spaces is : " + rem_st);


    }
}
