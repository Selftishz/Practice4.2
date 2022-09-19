package Pack;

public class Square extends Shape{
    private double radius;

    public Square(double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return radius*radius;
    }

    public double getPerimeter(){
        return 4*radius;
    }

    public String getType(){
        return "Square";
    }
}
