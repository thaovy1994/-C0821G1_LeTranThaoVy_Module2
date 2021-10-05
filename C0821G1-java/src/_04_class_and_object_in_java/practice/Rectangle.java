package _04_class_and_object_in_java.practice;

import java.util.Scanner;

public class Rectangle {
    //3.Tạo class Main chứa phương thức main để thực thi chương trình
    public static void main(String[] args) {
        //Khai báo các biến lưu kích thước hình chữ nhật và gán giá trị
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        //4.Khởi tạo một đối tượng thuộc lớp Rectangle với phương thức khởi tạo chứa 2 tham số width, height
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPerimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }

    //1.Khai báo các thuộc tính (properties), định nghĩa các phương thức khởi tạo (contructors) trong class Rectangle
    double width, height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //2.Định nghĩa các phương thức getArea(), getPerimeter(), display()
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }
}
