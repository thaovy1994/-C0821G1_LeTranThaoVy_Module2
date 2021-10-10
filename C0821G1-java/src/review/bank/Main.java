package review.bank;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account(123,"mina", 500000.0);
        Action acc2 = new Action(123456, "may",500000.0,100000.0,200000.0);
        Action acc3 = new Action(321,"moon", 150000.0,0.0,200000.0);

//        System.out.println(acc1);
//        System.out.println(acc2);
        System.out.println(acc3);
    }
}
