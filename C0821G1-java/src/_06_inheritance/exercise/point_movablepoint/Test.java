package _06_inheritance.exercise.point_movablepoint;

public class Test {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        MovablePoint point2 = new MovablePoint(2.2f,3.2f,4,5);
        point2.move();
        System.out.println(point1);
        System.out.println(point2);
        System.out.println(point2.move());
    }
}
