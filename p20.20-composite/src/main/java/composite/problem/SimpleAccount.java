package composite.problem;

public class SimpleAccount implements Account {

    private double balance;

    @Override
    public double getBalance() {
        return this.balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

    public void withdraw(double value) {
        this.balance -= value;
    }

}
