package Day18;

//upcasting ---- converting data to smaller to larger datatype
//upcasting is the automatic process

//int --> long
//float --> double

//downcasting ---- converting data to larger to smaller datatype
//downcasting is the manual process
// long --> int
// double--> float

public class TypeCastingDemo {
    public static void main(String[] args) {

        // upcasting -- automatic process -- smaller to larger
        int intvalue=100;
        long longvalue=intvalue;
        System.out.println(longvalue);


        float floatvalue = 10.5F;
        double doublevalue = floatvalue;
        System.out.println(doublevalue);

        // downcasting -- manual process --  larger to smaller

        long longvalue1 = 30010;
        int intvalue1=(int)longvalue1;
        System.out.println(intvalue1);

        double doublevalue1 = 10.5d;
        float floatvalue1 = (float)doublevalue1;
        System.out.println(floatvalue1);

        //problem in downcasting is that when there is large data and we convert into small data type so we loss the data.






    }
}
