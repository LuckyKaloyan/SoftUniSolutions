package SoftUniJavaOOP.OOP.Polymorphism.Lab.Shapes;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(3, 4);
        Circle circle = new Circle(5);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
    }
}