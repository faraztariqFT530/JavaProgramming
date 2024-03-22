package Day11;

public class ConstructorDemo {
    int x, y;
    ConstructorDemo(){   //default constructor
        x = 100;
        y = 200;
    }

    ConstructorDemo(int a, int b){  // parametrized constructor
         x=a;
         y=b;
    }

    void printSum(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {
    ConstructorDemo obj1 = new ConstructorDemo();
    ConstructorDemo obj2 = new ConstructorDemo(5,10);
    obj1.printSum();
    obj2.printSum();
    }
}
