package Day17.pack1;

public class Test1 {
   /*
   private int x= 8000;   //This can be used only in this class only
   private void m1()      //This can be used only in this class only
    {
        System.out.println("This is the m1 method");
    }
    */


   /*  int x = 8000;   //This can be used only in outside class only but within same package, it is default by-default
     void m1()      //This can be used only in outside class only but within same package, it is default by-default
    {
        System.out.println("This is the m1 method");
    }
    */


   protected int x = 8000;   //This can be used in outside class in different package only but with inheritance and importing the package
    protected void m1()     //This can be used in outside class in different package only but with inheritance and importing the package
    {
        System.out.println("This is the m1 method");
    }


    public int y =5000;   //This can be used in outside class in different package only but without inheritance and with importing the package
    public void m2()      //This can be used in outside class in different package only but without inheritance and with importing the package
    {
        System.out.println("This is the m2 method");
    }


}
