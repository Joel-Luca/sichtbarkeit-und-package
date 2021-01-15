package geometry;

public class Rectangle {
    public static void main(String[] args) {

        int width = 4;
        int height = 5;

        System.out.println("Fläche: " + calculateArea(width, height));
        System.out.println("Umfang: " + calculateCircumference(width, height));
    }

    public static double calculateArea(double width, double height) {
        return width * height;
    }

    public static double calculateCircumference(double width, double height) {
        return (width + height) * 2;
    }
}

