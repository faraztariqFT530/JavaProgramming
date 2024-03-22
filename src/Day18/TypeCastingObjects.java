package Day18;
class Parent{
    String name="Bawa g";
    void m1(){
        System.out.println("This is parent class");
    }
}

class Child extends Parent{
    int id=101;
    void m2(){
        System.out.println("This is Child class");
    }
}
public class TypeCastingObjects {
    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.name);  //Parent
        System.out.println(c.id);    //Child
        c.m1();  //Parent
        c.m2();   //Child


        Parent p = new Child();    //upcasting
        System.out.println(p.name);   //Parent
        p.m1();   //Parent
        //System.out.println(p.id);    //Child methods and variables are not accessible
        //p.m2();      //Child methods and variables are not accessible



        Parent p1 = new Parent();       //downcasting
        Child c1 =(Child) p1;         //we will get runtime error , a typecasting exception
        System.out.println(c1.name);        //Now we can access every method and variable with child variable
        System.out.println(c1.name);
        c1.m1();
        c1.m2();

    }
}
