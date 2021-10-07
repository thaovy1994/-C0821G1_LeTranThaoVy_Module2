package _04_class_and_object_in_java.exercise;

public class QuadraticEquation {
    private static int delta;

    public static void main(String[] args) {
        //Nhập vào 3 giá trị cho a, b, c và hiển thị kết quả dựa trên việc tính delta.
        QuadraticEquation equation = new QuadraticEquation();
        equation.getDiscriminant();
        equation.setA(1);
        equation.setB(2);
        equation.setC(1);

        if (equation.getDiscriminant() > 0) {
            System.out.println("Root 1" + equation.getRoot1());
            System.out.println("Root 2" + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Root 1 = Root 2 = " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    //Định nghĩa phương thức getDiscriminant() trả về delta
    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public double getRoot1() {
        return (-b + Math.pow(b * b - 4 * a * c, 0.5) / 2 * a);
    }

    public double getRoot2() {
        return (-b - Math.pow(b * b - 4 * a * c, 0.5) / 2 * a);
    }

}
