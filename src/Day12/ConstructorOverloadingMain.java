package Day12;

public class ConstructorOverloadingMain {
    public static void main(String[] args) {


    ConstructorOverloading obj1 = new ConstructorOverloading(); //1
    ConstructorOverloading obj2 = new ConstructorOverloading(10.5, 99.6, 30.5);

    ConstructorOverloading obj3 = new ConstructorOverloading(80.3);


    System.out.println(obj1.volume());
    System.out.println(obj2.volume());
    System.out.println(obj3.volume());

}
}