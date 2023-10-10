package composite.solution2;

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

    @Override
    public int getChildCount() {
        return 0;
    }

    @Override
    public Account getChild(int index) {
        throw new RuntimeException();
    }

}
