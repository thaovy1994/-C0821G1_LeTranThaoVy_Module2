package review._10_11.bank;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(123, "mina", 50);
        Account acc2 = new Account(321, "may", 50);
        acc1.outputMoney(60.0);
        acc2.inputMoney(200.0);

        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println("mature: " + acc2.getMature());
    }
}
