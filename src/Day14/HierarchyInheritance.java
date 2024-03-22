package Day14;

class Parent{
void display(){
    System.out.println("Hi i am parent class");
}
}

class Child1 extends Parent{
void show(){
    System.out.println("Hi this is child 1 class");
}
}


class Child2 extends Parent{
    void print(){
        System.out.println("Hi this is child 2 class");
    }
}
public class HierarchyInheritance {
    public static void main(String[] args) {
Child1 c1 = new Child1();
c1.display();
c1.show();
    }
}
