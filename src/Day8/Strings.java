package Day8;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String st;
        st = sc.nextLine();  // Print whole string as output
        System.out.println(st);
        System.out.println("Enter more than two words");
        st = sc.next();   // Print only first word as output, it ignores the other string only include first word
        System.out.println(st);
        System.out.println("Array length is " + st.length());  // returns length of string,, space is also added as one length
        System.out.println("Character at third index is " + st.charAt(3));

    }
}
