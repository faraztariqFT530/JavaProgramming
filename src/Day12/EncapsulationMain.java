package Day12;

public class EncapsulationMain {
    public static void main(String[] args) {
        Encapsulation obj1 = new Encapsulation();
      //  obj1.name="Faraz";
      //  obj1.id=101;
     //   obj1.city="Islamabad";

        obj1.setName("RajaGee");
        System.out.println(obj1.getName());

        obj1.setId(1001);
        System.out.println(obj1.getId());

        obj1.setCity("Islamabad");
        System.out.println(obj1.getCity());
    }
}
