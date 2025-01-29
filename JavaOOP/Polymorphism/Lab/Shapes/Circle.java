package SoftUniJavaOOP.OOP.Polymorphism.Lab.Shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        setArea(Math.PI * radius * radius);
        return getArea();
    }

    @Override
    public double calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
        return getPerimeter();
    }

    public final double getRadius() {
        return radius;
    }
}
