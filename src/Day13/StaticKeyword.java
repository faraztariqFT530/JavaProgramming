package Day13;

public class StaticKeyword {
    static int a=10;     //static variable
    int b;          //non-static variable

    static void m1(){             //static method
        System.out.println("This is m1 static method");
    }
    void m2(){                 //non-static method
        System.out.println("This is m2 non-static method");
    }

    void m(){               //non-static method can access everything directly
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();
    }
    public static void main(String[] args) {
        System.out.println(a);   //no object needed to call the static variables and methods
        m1();

       // System.out.println(b);  // can't access because b is non-static
       // m2(); // can't access because m2 is non-static


        StaticKeyword obj1 = new StaticKeyword();
        obj1.b=5;
        System.out.println(obj1.b);
        obj1.m2();

        obj1.m();
    }
}
