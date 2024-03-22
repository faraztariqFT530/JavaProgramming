package Day11;

public class MethodsMain {
    public static void main(String[] args) {
        //Creating object
        Methods m1 = new Methods();
        //1.Calling method having no parameters and no return type
        m1.method1();

        //2.Calling method having no parameters and having return type
       String output = m1.method2();
        System.out.println(output);

        //3.Calling method having parameters and no return type
        m1.method3("Faraz Tariq");

        //4.Calling method having parameters and have a return type
        String output1 = m1.method4("Faraz Tariq");
        System.out.println(output1);
    }
}
