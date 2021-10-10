package review.bank;

public class Account {
    private long accountNumber;
    private String accountName;
    private double ownMoney;

    public Account(){

    }

    public Account(long accountNumber, String accountName, double money) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.ownMoney = money;
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

    public double getOwnMoney() { return ownMoney; }

    public void setOwnMoney(double money) {
        this.ownMoney = money;
    }

    @Override
    public String toString(){
        return "Account information: \n Account Number: "
                + getAccountNumber()+
                "\n Account Name: "
                +getAccountName()+
                "\n Money in Account: "
                +getOwnMoney();
    }
}
