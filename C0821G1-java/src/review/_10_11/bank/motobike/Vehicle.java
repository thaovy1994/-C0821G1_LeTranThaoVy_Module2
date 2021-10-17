package review._10_11.bank.motobike;

public class Vehicle {
    private int cc;
    private int price;

    public Vehicle() {

    }

    public Vehicle(int cc, int price) {
        this.cc = cc;
        this.price = price;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getTax() {
        if (cc < 100) {
            return price / 100;
        } else if (cc <= 200) {
            return price * 3 / 100;
        } else {
            return price * 5 / 100;
        }
    }

    public String toString() {
        return "Your motobike's cc is "
                + this.cc +
                ", so when U buy a motobike, U have to pay = "
                + getTax() +
                " for the tax.";
    }
}
