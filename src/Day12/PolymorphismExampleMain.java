package Day12;

public class PolymorphismExampleMain {
    public static void main(String[] args) {
        PolymorphismExample obj1 = new PolymorphismExample();
        obj1.sum();
        obj1.sum(4,6);
        obj1.sum(55, 60.33d);
        obj1.sum(99.22d, 33);
        obj1.sum(44,22,55);

    }
}
