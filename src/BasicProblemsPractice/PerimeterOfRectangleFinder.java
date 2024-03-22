package BasicProblemsPractice;

import java.util.Scanner;
public class PerimeterOfRectangleFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Rectangle Perimeter Calculator?");
        System.out.println("Enter the width of the rectangle whose Area is to be calculated?");
        double width = sc.nextDouble();
        System.out.println("Enter the height of the rectangle whose Area is to be calculated?");
        double height = sc.nextDouble();
        double Perimeter = 2 * (width + height);
        System.out.println("Area of rectangle is " + Perimeter);
    }
}