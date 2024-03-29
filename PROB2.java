interface Shape {
    double calculateArea();
    void displayDetails();
}

abstract class AbstractShape implements Shape {
    String name;

    public AbstractShape(String name) {
        this.name = name;
    }
}

class Circle extends AbstractShape {
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s: radius=%.2f, area=%.2f%n", name, radius, calculateArea());
    }
}

class Rectangle extends AbstractShape {
    double width;
    double height;

    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s: width=%.2f, height=%.2f, area=%.2f%n", name, width, height, calculateArea());
    }
}

public class PROB2 {
    public static void main(String[] args) {
        Circle circle = new Circle("Circle", 5);
        System.out.println("Circle details:");
        circle.displayDetails();

        Rectangle rectangle = new Rectangle("Rectangle", 3, 4);
        System.out.println("Rectangle details:");
        rectangle.displayDetails();
    }
}
