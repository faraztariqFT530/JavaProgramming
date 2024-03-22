package Day14;


    class A{
        int a = 5;
        void print ()
        {
            System.out.println(a);
        }
    }

    class B extends A {
        int b = 44;
        void show(){
            System.out.println(b);
        }
    }

    class C extends B{
        int c = 30;
        void display(){
            System.out.println(c);
        }
    }
public class InheritanceExamples {
    public static void main(String[] args) {
        B objb = new B();
        System.out.println(objb.a);
        System.out.println(objb.b);
        objb.print();
        objb.show();
        C objc = new C();
        objc.print();
        objc.show();
        objc.display();
    }
    }

