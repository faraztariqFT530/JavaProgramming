package Day16;
interface Shape{
    int length=33;
    int width = 88;

    void circle();
    default void square(){
        System.out.println("This is the square - default method");
    }

    static void Rectangle(){
        System.out.println("This is the Rectangle - static method");
    }
}
public class InterfaceExamples implements Shape{
  public void circle(){
        System.out.println("This is the circle - abstract method");
    }

    void triangle(){
        System.out.println("This is a triangle...");
    }

    int x=90, y=88;
    public static void main(String[] args) {

      //Case-1
        InterfaceExamples intobj = new InterfaceExamples();
        intobj.circle();   //abstract method
        intobj.square();    //default method
       Shape.Rectangle();    //Static method can directly be accessed from interface, no object required
        intobj.triangle();    //  it is a default method by default, can be accessed using class variable
        System.out.println(intobj.x * intobj.y);    //can be accessed using class variable

        //Case-2
        Shape sh = new InterfaceExamples();
        sh.circle();      //abstract method
        sh.square();         //default method
        Shape.Rectangle();      //Static method can directly be accessed from interface, no object required
        //sh.triangle();         //Can't access it because it is an interface variable and does not contain that method.
        System.out.println(Shape.length * Shape.width);   // accessing static variables directly without object
        //System.out.println(sh.x * sh.y);     //Can't access it because it is an interface variable and does not contain that variables.
    }
}
