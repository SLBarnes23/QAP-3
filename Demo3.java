public class Demo3 {
    public static void main(String[] args) {
        // Create an instance of Point
        Point point = new Point(2.5f, 3.5f);
        System.out.println(point);

        // Create an instance of MovablePoint
        MovablePoint movablePoint = new MovablePoint(1.5f, 2.5f, 0.5f, 0.5f);
        System.out.println(movablePoint);
        movablePoint.move();
        System.out.println("After moving: " + movablePoint);

        // Create another instance of MovablePoint
        MovablePoint anotherMovablePoint = new MovablePoint(4.0f, 3.0f);
        anotherMovablePoint.setXY(0.0f, 0.0f);
        System.out.println(anotherMovablePoint);
        anotherMovablePoint.move();
        System.out.println("After moving: " + anotherMovablePoint);
    }
}
