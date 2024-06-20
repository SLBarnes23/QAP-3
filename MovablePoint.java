public class MovablePoint extends Point {
    // Instance variables
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // No-argument constructor
    public MovablePoint() {
        super();
    }

    // Constructor with parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Constructor with xSpeed and ySpeed
    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    // Setter for xSpeed
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    // Setter for ySpeed
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Getter for both xSpeed and ySpeed
    public float[] getSpeed() {
        return new float[] { xSpeed, ySpeed };
    }

    // Setter for both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Move method
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}