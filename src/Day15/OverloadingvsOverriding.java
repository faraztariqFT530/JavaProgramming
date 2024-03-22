package Day15;

class ABC{
    void m1(int a){
        System.out.println(a);
    }
    void m2(int b){
        System.out.println(b);
    }
}
class XYZ extends ABC{
    void m1(int a){            //overriding
        System.out.println(a*a);
    }
    void m2(int b){          //overriding
        System.out.println(b*b);
    }
    void m2(int a, int b){            //overloading
        System.out.println(a+b);
    }
}

public class OverloadingvsOverriding {
    public static void main(String[] args) {
    XYZ obj = new XYZ();
    obj.m1(5);
    obj.m2(10);
    obj.m2(4,8);
    }
}
