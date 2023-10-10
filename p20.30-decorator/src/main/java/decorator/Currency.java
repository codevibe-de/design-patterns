package decorator;

public enum Currency {

    EURO("€"), DOLLAR("$");

    public String symbol;

    Currency(String symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return this.symbol;
    }

}
