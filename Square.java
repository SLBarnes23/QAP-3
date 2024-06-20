public class Square extends Rectangle {

    // Constructor with side
    public Square(double side) {
        super(side, side); // Calls the constructor of Rectangle with side as width and length
    }

    // Constructor with side, color, and filled
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Calls the constructor of Rectangle with side as width and length
    }

    // Getter for side (same as width)
    public double getSide() {
        return getWidth();
    }

    // Setter for side (sets both width and length to maintain square geometry)
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override the setWidth method to maintain square geometry
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override the setLength method to maintain square geometry
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // toString method
    @Override
    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of " + super.toString();
    }
}