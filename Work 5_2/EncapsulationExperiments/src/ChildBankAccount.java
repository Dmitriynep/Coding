public class ChildBankAccount {
    public ChildBankAccount() {
    }

    private double balance = 0;
    private double maxBalance;

    public ChildBankAccount(double maxBalance){
        balance = 0.0;
        this.maxBalance = maxBalance;

    }
    public boolean depositMoney(double value) {

        if (balance + value <= maxBalance && value >= 0) {
            balance = balance + value;
            return true;
        }
        else return false;

    }

    public boolean debitMoney(double value) {
        if (value>=0 && balance - value >=0) {
            balance = balance - value;
            return true;
        }

        else return false;

    }

    public double getBalance() {
        return balance;
    }

}
