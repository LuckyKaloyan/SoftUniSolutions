package SoftUniJavaOOP.OOP.Polymorphism.Lab.Shapes;

public abstract class Shape {
    private double perimeter;
    private double area;

    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    protected void setArea(double area) {
        this.area = area;
    }

    abstract public double calculatePerimeter();
    abstract public double calculateArea();
}