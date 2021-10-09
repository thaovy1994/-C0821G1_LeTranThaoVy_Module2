package _06_inheritance.exercise.class_cycle_cylinder;

import _06_inheritance.exercise.class_cycle_cylinder.Circle;
import _06_inheritance.exercise.class_cycle_cylinder.Cylinder;

public class Test {
    public static void main(String[] args) {
        Cylinder cyl = new Cylinder(2,"yellow",3);
        Circle cir = new Circle(3,"red");
        System.out.println(cir);
        System.out.println(cyl);
    }
}
