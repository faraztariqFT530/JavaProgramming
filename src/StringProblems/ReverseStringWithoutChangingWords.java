package StringProblems;

import java.util.Scanner;

public class ReverseStringWithoutChangingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string which you want to reverse words");
        String st = sc.nextLine();
        String words[] =  st.split(" ");
        String ans = "";
        for(int i=words.length-1; i>=0; i--){
            ans = ans + words[i];
            if(i>0){
                ans = ans + " ";
            }
        }
        System.out.println(ans);

    }
}
