package buteelt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Circle {
    private static final double PI = 3.14;
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Circle> circles = new ArrayList<>();

        System.out.println("------------------------------------------------------------");
        System.out.println("CircleCalc v1.0");
        System.out.println();
        System.out.println("Calculates and prints information for a user-supplied radius");
        System.out.println("------------------------------------------------------------");

      
        System.out.print("Enter the number of circles: ");
        int numCircles = in.nextInt();

     
        for (int i = 0; i < numCircles; i++) {
            System.out.print("Enter the radius for circle " + (i + 1) + ": ");
            double radius = in.nextDouble();
            Circle c = new Circle(radius);
            circles.add(c);
        }

        
        System.out.println("------------------------------------------------------------");
        System.out.println("Results:");
        for (int i = 0; i < numCircles; i++) {
            Circle c = circles.get(i);
            System.out.println("Circle " + (i + 1) + ":");
            System.out.println("Radius: " + c.getRadius());
            System.out.println("Area: " + c.calculateArea());
            System.out.println("Circumference: " + c.calculateCircumference());
            System.out.println("----------------------------------------------------------");
        }
    }
}
