package composite.solution2;

// This interface makes use of the COMPOSITE pattern (through two child-related methods)
public interface Account {

    double getBalance();

    int getChildCount();

    Account getChild(int index);

}
