package BasicProblemsPractice;

import java.util.Scanner;

public class CirclePerimeterFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (radius) for which the circle perimeter is calculated?");
        double radius = sc.nextDouble();
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Calculated perimeter of given radius " + radius + " is " + perimeter);
    }
}