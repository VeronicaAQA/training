package classAndOop.circle;

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return (Math.PI * radius * radius);
    }

    public double getCircumference() {
        return (2 * Math.PI * radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Площадь: " + circle.getArea());
        System.out.println("Длина окружности: " + circle.getCircumference());
    }
}

