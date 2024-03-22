package Day17;

public class DataConversionMethods {
    public static void main(String[] args) {

        //String --> int
        //String s = "Welcome";   // not possible to convert into int, double, char, boolean
        String s1 = "150";
        String s2 = "200";
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));


        //String --> double
        String s3 = "150.6";
        String s4 = "200.4";
        System.out.println(Double.parseDouble(s3)+Double.parseDouble(s4));


        //String --> boolean
        String s5 = "true";
        System.out.println(Boolean.parseBoolean(s5));

        String s6 = "false";    // other than true, if we pass any string, it will return false
        System.out.println(Boolean.parseBoolean(s6));


        //String --> char (not possible)


        //int, double, bool, char -->  String
        int a = 20;
        double d = 20.5;
        char c = 'A';
        boolean bool = false;

        String s7 = String.valueOf(a);
        System.out.println(s7);

        String s8 = String.valueOf(d);
        System.out.println(s8);

        String s9 = String.valueOf(c);
        System.out.println(s9);

        String s10 = String.valueOf(bool);
        System.out.println(s10);




    }
}
