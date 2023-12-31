package composite.solution1;


public class Application {

    public static void main(String[] args) {
        final AccountGroup topGroup = new AccountGroup();
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

        topGroup.add(g1);
        topGroup.add(g2);
        g1.add(a11);
        g1.add(a12);
        g2.add(a21);
        g2.add(a22);

        System.out.println("\ntopGroup.Balance");
        System.out.println(topGroup.getBalance());

        System.out.println("\nPrint(topGroup)");
        print(topGroup, "");
    }

    static void print(Account account, String indent) {
        System.out.println(indent + account.getBalance());
        // this cast isn't very nice -- how can we improve that?
        if (account instanceof AccountGroup group) {    // pattern matching
            for (int i = 0; i < group.getChildCount(); i++) {
                final Account child = group.getChild(i);
                print(child, indent + "\t");
            }
        }
    }
}
