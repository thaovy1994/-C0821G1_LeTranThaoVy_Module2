package review.bank;

public class Account {
    private long accountNumber;
    private String accountName;
    private double ownMoney;
    private double moneyInput;
    private double moneyOutput;
    //    private double moneyOutputFee;
    private static final double RATE = 0.035;

    public Account() {

    }

    public Account(long accountNumber, String accountName, double money) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.ownMoney = 50;
    }

    public Account(long accountNumber, String accountName, double ownMoney, double moneyInput, double moneyOutput) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.ownMoney = ownMoney;
        this.moneyInput = moneyInput;
        this.moneyOutput = moneyOutput;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getOwnMoney() {
        return ownMoney;
    }

    public void setOwnMoney(double money) {
        this.ownMoney = money;
    }

    public void inputMoney(double moneyInput) {
        if (moneyInput < 0) {
            System.out.println("input amount of money need to more than 0");
        } else {
            this.setOwnMoney(this.getOwnMoney() + moneyInput);
        }
    }

    public double outputMoney(double moneyOutput) {
        if (moneyOutput > this.getOwnMoney()) {
            System.out.println("Invalid");
        } else {
            this.setOwnMoney(this.getOwnMoney() - moneyOutput);
        }
        return this.getOwnMoney();
    }

    public double getMature() {
        return this.getOwnMoney() + this.getOwnMoney() * Account.RATE;
    }

    public String toString() {
        return "Account information: \n Account Number: "
                + this.getAccountNumber() +
                "\n Account Name: "
                + this.getAccountName() +
                "Money in Account before: 50" +
                "\n Money in Account after withdrawing/deposit: "
                + this.getOwnMoney();
    }
}
