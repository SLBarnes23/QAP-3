public class Rectangle extends Shape {
    // Instance variables
    private double width;
    private double length;

    // No-argument constructor
    public Rectangle() {
        super(); // Calls the no-arg constructor of Shape
        this.width = 1.0;
        this.length = 1.0;
    }

    // Constructor with width and length
    public Rectangle(double width, double length) {
        super(); // Calls the no-arg constructor of Shape
        this.width = width;
        this.length = length;
    }

    // Constructor with width, length, color, and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); // Calls the constructor of Shape with color and filled
        this.width = width;
        this.length = length;
    }

    // Getter for width
    public double getWidth() {
        return width;
    }

    // Setter for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter for length
    public double getLength() {
        return length;
    }

    // Setter for length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to calculate area
    public double getArea() {
        return width * length;
    }

    // Method to calculate perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // toString method
    @Override
    public String toString() {
        return "A Rectangle with width=" + width + " and length=" + length + ", which is a subclass of " + super.toString();
    }
}