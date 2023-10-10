package composite.solution2;

public class Application {
    public static void main(String[] args) {
        final AccountGroup g = new AccountGroup();
        final AccountGroup g1 = new AccountGroup();
        final AccountGroup g2 = new AccountGroup();
        final SimpleAccount a11 = new SimpleAccount();
        final SimpleAccount a12 = new SimpleAccount();
        final SimpleAccount a21 = new SimpleAccount();
        final SimpleAccount a22 = new SimpleAccount();
        a11.deposit(1000);
        a12.deposit(2000);
        a21.deposit(3000);
        a22.deposit(4000);
        g.add(g1);
        g.add(g2);
        g1.add(a11);
        g1.add(a12);
        g2.add(a21);
        g2.add(a22);

        System.out.println("\ng.Balance");
        System.out.println(g.getBalance());

        System.out.println("\nPrint(a11)");
        print(a11, "");

        System.out.println("\nPrint(g)");
        print(g, "");
    }

    static void print(Account account, String indent) {
        System.out.println(indent + account.getBalance());
        for (int i = 0; i < account.getChildCount(); i++) {
            final Account child = account.getChild(i);
            print(child, indent + "\t");
        }
    }
}
