package Day19;

import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program is started");

        //Example1
        System.out.println("Enter the number which you want to divide by 100");
        int x = sc.nextInt();
        try {
            System.out.println(100/x);    //ArithmeticException if divided by 0
        }
        catch (ArithmeticException e){
            System.out.println("Invalid Data");
        }


        /*
        //Example2
        int a[] = new int[5];
        System.out.println("Enter the position(0-4)");
        int pos = sc.nextInt();

        System.out.println("Enter the value");
        int val = sc.nextInt();

        a[pos] = val;        //ArrayIndexOutOfBoundsException if pos value is greater than 4 i.e. max size of array declared
        System.out.println(a[pos]);
        */

        Thread.sleep(5000);
        //Example3
       String s ="welcome";
        //String s = "12345";
        try {
            System.out.println(Integer.parseInt(s));    // Number format exception if words are parsed into integer
        }
        catch (Exception e){
            System.out.println("Handling exceptions");
            System.out.println(e.getMessage());
        }

        //Example4

        //Let's suppose we don't know what exact exception our program throws, then we can add multiple catch statements
        //And only those block will be executed which exception is thrown
        //Disadvantage is that if any other exception other than those encounter, it will fail and the code is looking messier
        //Now for fixing that, only one catch block should be written with Exception e
        //Exception is the super class of all the exceptions.

       String s1 = null;
       try {
           System.out.println(s1.length());      //NullPointerException if null value length is calculated
       }
       catch (ArithmeticException e){
           System.out.println("Handling exception");
           System.out.println(e.getMessage());
       }
       catch (NullPointerException e){
           System.out.println("Handling exception");
           System.out.println(e.getMessage());
       }
       catch (ArrayIndexOutOfBoundsException e){
           System.out.println("Handling exception");
           System.out.println(e.getMessage());
       }
        System.out.println("Program is completed");
        System.out.println("Program is Exited");

    }





}
