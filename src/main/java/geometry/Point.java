package geometry;

public class Point {

    static int x;
    static int y;

    public static void main(String[] args) {
        Point.setX(2);
        Point.setY(3);

        int x = Point.getX();
        int y = Point.getY();

        System.out.println(x + "," + y);
    }

    public static void setX(int x) {
        Point.x = x;
    }

    public static void setY(int y) {
        Point.y = y;
    }

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }
}

