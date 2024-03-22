package Day2;

public class VariablesDemo {

    public static void main(String[] args) {
        int a;  // Declaration
        a = 90; // assignment of the variable


        //Approach 1: This approach is possible if all the variables are of different Data type
        /*
        int x = 89;
        int y = 77;
        int z = 99;
         */

        //Approach 2:  This approach is only possible if all the variables are of same Data type
        /*
        int x,y,z;
        x = 89;
        y = 77;
        z = 99;
         */

        //Approach 3: This approach is only possible if all the variables are of same Data type
        int x=89, y=77, z=99;

        System.out.println(x+y+z);
        System.out.println(x + " " + y + " " + z);
    }
}
