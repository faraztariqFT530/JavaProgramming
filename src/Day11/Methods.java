package Day11;

public class Methods {

    //1. no parameters and no return type

    void method1(){
        System.out.println("This is a method which has no parameters and return type");
    }

    //2. no parameters and have return type

    String method2(){
        return("This is a method which has no parameters and has a return type");
    }

    //3. Has parameters and have no return type
    void method3(String person){
        System.out.println("Hi " + person + " This is a method which has parameters and no return type");
    }

    //4. Has parameters and have a return type

    String method4 (String person){
        return("Hi " + person + " This is a method which has parameters and a return type");
    }
}
