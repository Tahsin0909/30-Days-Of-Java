// Abstract Shape with Circle, Rectangle and Triangle, summing areas polymorphically|
public class AbstractShape {

    abstract class Shape {
        abstract double calculateArea();
    }

    class Circle extends Shape {
        double radius = 5;

        @Override
        double calculateArea() {
            return 3.1416 * radius * radius;
        }
    }

    class Rectangle extends Shape {
        double length = 4;
        double width = 6;

        @Override
        double calculateArea() {
            return length * width;
        }
    }

    class Triangle extends Shape {
        double length = 4;
        double base = 6;

        @Override
        double calculateArea() {
            return (length * base) / 2;
        }
    }

    public static void main(String[] args) {
        AbstractShape shape = new AbstractShape();
        Circle circle = shape.new Circle();
        Rectangle rectangle = shape.new Rectangle();
        Triangle triangle = shape.new Triangle();
        System.out.println(circle.calculateArea());
        System.out.println(rectangle.calculateArea());
        System.out.println(triangle.calculateArea());
    }
}
