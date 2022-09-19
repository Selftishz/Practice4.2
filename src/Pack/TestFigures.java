package Pack;

public class TestFigures {
    public static void main(String[] args) {

            Circle circle = new Circle(10);
            System.out.println("type: " + circle.getType() + " area: " + circle.getArea());
            System.out.println("type: " + circle.getType() + " perimeter: " + circle.getPerimeter());

            Rectangle rectangle = new Rectangle(10);
            System.out.println("type: " + rectangle.getType() + " area: " + rectangle.getArea());
            System.out.println("type: " + rectangle.getType() + " perimeter: " + rectangle.getPerimeter());

            Square square = new Square(10);
            System.out.println("type: " + square.getType() + " area: " + square.getArea());
            System.out.println("type: " + square.getType() + " perimeter: " + square.getPerimeter());
    }
}

