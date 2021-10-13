package _07_abstractclass_interface.exercise;

public class MainTest {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(1.2, "blue", true);
        array[1] = new Rectangle(1.3, 2.3, "yellow", true);
        array[2] = new Square(3);

        System.out.println(" Before resizing: ");
        for (Shape a : array) {
            System.out.print(a);
        }

        int upSize = (int) Math.floor(Math.random() * 100);
        System.out.println("\n After resizing: ");
        for (Shape b : array) {
            if (b instanceof Circle) {
                ((Circle)b).resize(upSize);
            }else if(b instanceof Rectangle) {
                ((Rectangle)b).resize(upSize);
            }else {
                ((Square)b).resize(upSize);
            }
            System.out.print(b);
        }

        for (Shape c: array){
            if (c instanceof Square) {
                ((Square) c).howToColor();
            }
        }
    }
}
