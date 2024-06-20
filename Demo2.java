public class Demo2 {
    public static void main(String[] args) {
        // Create an instance of Shape
        Shape shape = new Shape();
        System.out.println(shape.toString());
        
        // Create an instance of Circle
        Circle circle = new Circle(5.0, "blue", false);
        System.out.println(circle.toString());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Create an instance of Rectangle
        Rectangle rectangle = new Rectangle(4.0, 7.0, "red", true);
        System.out.println(rectangle.toString());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Create an instance of Square
        Square square = new Square(6.0, "yellow", true);
        System.out.println(square.toString());
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
    }
}

