package BasicProblemsPractice;

import java.util.Scanner;

public class CircleAreaFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (radius) for which the circle area is calculated?");
        double radius = sc.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Calculated area of given radius " + radius + " is " + area);
    }
}
