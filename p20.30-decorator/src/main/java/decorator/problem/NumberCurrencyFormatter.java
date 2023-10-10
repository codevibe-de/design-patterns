package decorator.problem;

import decorator.Currency;
import decorator.NumberFormatter;

import java.math.BigDecimal;

public class NumberCurrencyFormatter extends NumberFormatter {

    private final Currency currency;

    public NumberCurrencyFormatter(Currency currency) {
        this.currency = currency;
    }

    @Override
    public String format(BigDecimal value) {
        final String s = super.format(value);
        return s + " " + this.currency.symbol;
    }
}
