package Pack;

public class Rectangle extends Shape {
    private double radius;

    public Rectangle(double a) {
        this.radius = radius;
    }

    public double getArea() {
        return (radius * radius * 1.81) / 4;
    }

    public double getPerimeter() {
        return 3*radius;
    }

    public String getType() {
        return "Rectangle";
    }
}
