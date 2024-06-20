public class Circle extends Shape {
    // Instance variable
    private double radius;

    // No-argument constructor
    public Circle() {
        super(); // Calls the no-arg constructor of Shape
        this.radius = 1.0;
    }

    // Constructor with radius
    public Circle(double radius) {
        super(); // Calls the no-arg constructor of Shape
        this.radius = radius;
    }

    // Constructor with radius, color, and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); // Calls the constructor of Shape with color and filled
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Method to calculate perimeter (circumference)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // toString method
    @Override
    public String toString() {
        return "A Circle with radius=" + radius + ", which is a subclass of " + super.toString();
    }
}