package Day8;

import java.util.Scanner;

public class WordCounterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        int count = 1;
        System.out.println("Enter the string which words you want to count");
        st = sc.nextLine();
        for(int i=0; i<st.length()-1; i++){
            if( (st.charAt(i) == ' ') && (st.charAt(i+1)!=' ') )
            {
                count++;
            }
        }
        System.out.println("Words in the string " + st + " is : " +count);


    }
}
