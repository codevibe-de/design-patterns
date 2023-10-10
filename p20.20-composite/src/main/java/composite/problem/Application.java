package composite.problem;


public class Application {

    public static void main(String[] args) {
        final AccountGroup topGroup = new AccountGroup();
        final AccountGroup subGroup1 = new AccountGroup();
        final AccountGroup subGroup2 = new AccountGroup();

        final SimpleAccount a11 = new SimpleAccount();
        final SimpleAccount a12 = new SimpleAccount();
        final SimpleAccount a21 = new SimpleAccount();
        final SimpleAccount a22 = new SimpleAccount();
        a11.deposit(1000);
        a12.deposit(2000);
        a21.deposit(3000);
        a22.deposit(4000);

        subGroup1.add(a11);
        subGroup1.add(a12);
        subGroup2.add(a21);
        subGroup2.add(a22);

        // what's my OVERALL balance over both sub-groups?
        System.out.println("\ntopGroup.Balance");
        System.out.println(topGroup.getBalance());
    }

    static void print(Account account, String indent) {
        System.out.println(indent + account.getBalance());
        if (account instanceof AccountGroup group) {
            for (int i = 0; i < group.getChildCount(); i++) {
                final Account child = group.getChild(i);
                print(child, indent + "\t");
            }
        }
    }
}
