package decorator.solution;

import decorator.Currency;
import decorator.NumberFormatter;

import java.math.BigDecimal;

public class NumberCurrencyFormatter extends NumberFormatter {

    private final NumberFormatter formatter;
    private final Currency currency;

    public NumberCurrencyFormatter(Currency currency, final NumberFormatter formatter) {
        this.formatter = formatter;
        this.currency = currency;
    }

    @Override
    public String format(BigDecimal value) {
        final String s = this.formatter.format(value);
        return s + " " + this.currency.symbol;
    }
}
