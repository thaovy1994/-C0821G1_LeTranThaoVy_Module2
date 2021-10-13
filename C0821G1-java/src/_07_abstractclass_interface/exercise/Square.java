package _07_abstractclass_interface.exercise;


public class Square extends Rectangle implements Resizeable, Colorable {

    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(String color, boolean filled, double side) {
        super( side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return "\nA Square with side = "
                + getSide()
                + ", which is a subclass of A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getLength();
    }

    @Override
    public void resize(double percent) {
        this.setSide(this.getWidth() + this.getWidth() * (percent / 100));
        this.setSide(this.getLength() + this.getLength() * (percent / 100));
    }

    @Override
    public void howToColor() {
        System.out.println("\nColor all four sides..");
    }
}
