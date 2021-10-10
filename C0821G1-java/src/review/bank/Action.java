package review.bank;

public class Action extends Account {
    private double moneyInput;
    private double moneyOutput;
    private double moneyOutputFee = 1100.0;
    private static final double RATE = 0.035;

    public Action(){

    }
    public Action(double moneyInput, double moneyOutput) {
        this.moneyInput = moneyInput;
        this.moneyOutput = moneyOutput;
    }

    public Action(long accountNumber, String accountName, double money, double moneyInput, double moneyOutput) {
        super(accountNumber, accountName, money);
        this.moneyInput = moneyInput;
        this.moneyOutput = moneyOutput;
    }

    public double getMoneyInput() {
        return moneyInput;
    }

    public void setMoneyInput(double moneyInput) {
        this.moneyInput = moneyInput;
    }

    public double getMoneyOutput() {
        return moneyOutput;
    }

    public void setMoneyOutput(double moneyOutput) {
        this.moneyOutput = moneyOutput;
    }

    public double getInputMoney() {
        return super.getOwnMoney() + this.moneyInput;
    }

    public double getOutputMoney() {
        return super.getOwnMoney() - this.moneyOutput - this.moneyOutputFee;
    }
    public double getMature(){
        return super.getOwnMoney() + super.getOwnMoney() * Action.RATE;
    }

//    public Information getTransfer(){
//        if (this.moneyOutput > super.getOwnMoney()) {
//            System.out.println("Invalid");
//        } else {
//            getOutputMoney();
//        }
//        return this;
//    }

    @Override
    public String toString(){
        return super.toString() +
                "\n Amount of money in Account after input: "
                + getInputMoney() +
                "\n Amount of money in Account after output: "
                + getOutputMoney();
//                 +"\n "
//                + getTransfer();
    }
}
