package app;

import geometry.Circle;

public class CircleApp {
    public static void main(String[] args) {
        int radius = 5;
        double area = Circle.calculateArea(radius);
        System.out.println("Kreisfläche bei Radius 5 cm: " + area + "cm");

        double circumference = Circle.calculateCircumference(5);
        System.out.println("Kreisumfang Radius 5cm: " + circumference + "cm");
    }
}
