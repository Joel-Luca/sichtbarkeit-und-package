package app;

import geometry.Point;

public class PointApp {
    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }
}
