package StringProblems;

import java.util.Scanner;

public class SearchWordInAParaString {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Para which you want to check insert");
        String para = sc.nextLine();
        System.out.println("Enter the word which you want to search in the above para");
        String word = sc.nextLine();
        if(para.indexOf(word)!=-1){
            System.out.println("The provided search text is available in the para");
        }
        else{
            System.out.println("The provided search text is not available in the para");
        }
    }
}
