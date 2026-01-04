package classAndOop.rectangle;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2.6, 3.5);
        System.out.println("площадь прямоугольника: " + calculateArea(rectangle.width, rectangle.height));
        System.out.println("периметр прямоугольника: " + calculatePerimeter(rectangle.width, rectangle.height));
    }

    private static double calculateArea(double width, double height) {
        return (width * height);
    }

    private static double calculatePerimeter(double width, double height) {
        return (2 * (width + height));
    }
}
