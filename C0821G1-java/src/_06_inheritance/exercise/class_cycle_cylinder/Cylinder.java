package _06_inheritance.exercise.class_cycle_cylinder;

import _06_inheritance.exercise.class_cycle_cylinder.Circle;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume(){
        return super.getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder with radius is "
                + super.getRadius() +
                ", color is "
                + super.getColor() +
                ", height is "
                + getHeight() +
                ", Volume is "
                + getVolume();
    }
}
