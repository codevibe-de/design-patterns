package composite.solution1;

import java.util.ArrayList;
import java.util.List;

// COMPOSITE pattern -- `Account` represents the "Component" interface
public class AccountGroup implements Account {

    private final List<Account> children = new ArrayList<>();

    @Override
    public double getBalance() {
        double sum = 0;
        for (final Account account : this.children) {
            sum += account.getBalance();
        }
        return sum;
    }

    public void add(Account account) {
        this.children.add(account);
    }

    public int getChildCount() {
        return this.children.size();
    }

    public Account getChild(int index) {
        return this.children.get(index);
    }

}
