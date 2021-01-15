package app;

import geometry.Rectangle;

public class RectangleApp {
    public static void main(String[] args) {

        int width = 4;
        int height = 5;

        System.out.println("Fläche: " + Rectangle.calculateArea(width, height));
        System.out.println("Umfang: " + Rectangle.calculateCircumference(width, height));
    }
}

