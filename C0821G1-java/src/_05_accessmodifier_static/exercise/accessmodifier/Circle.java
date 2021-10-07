package _05_accessmodifier_static.exercise.accessmodifier;

import _05_accessmodifier_static.practice.static_method.Student;

public class Circle {
    private double radius = 1;
    private String color = "red";
    public static final double PI = 3.14;

    Circle() {
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

//    public double getRadius() {
//    protected double getRadius() {
    double getRadius() {
    //private double getRadius() {  --> khong dung dc ngoai class
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public void display() {
        System.out.println("Circle with radius is: " + radius + " ,area is: " + this.getArea() + " ,color is: " + color);
    }
}
