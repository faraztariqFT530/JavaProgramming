package BasicProblemsPractice;

public class SwappingOfTwoNumbers {
    public static void main(String[] args) {
        int a = 8,b = 5;
        System.out.println("Before swapping " + a + " and " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping " + a + " and " + b);


        int temp, x=10,y=55;
        System.out.println("After swapping " + x + " and " + y);
        temp =x;
        x=y;
        y=temp;
        System.out.println("After swapping " + x + " and " + y);


    }
}
