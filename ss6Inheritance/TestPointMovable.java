package ss6Inheritance;

public class TestPointMovable {
    public static void main(String[] args) {
        Point p0 = new Point();
        System.out.println(p0);
        Point p2 = new Point(1.2f, 3.4f);
        System.out.println(p2);
        MovablePoint m0 =new MovablePoint();
        System.out.println(m0);
        MovablePoint m2 = new MovablePoint(5.6f,7.8f);
        System.out.println(m2);
        MovablePoint m4 = new MovablePoint(1.2f,3.4f,5.6f,7.8f);
        System.out.println(m4);
        m4.move();
        System.out.println(m4);
    }
}
