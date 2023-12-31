package decorator.solution;

import decorator.NumberFormatter;

import java.math.BigDecimal;

public class NumberFractionFormatter extends NumberFormatter {

    private final NumberFormatter formatter;
    private final int fraction;

    public NumberFractionFormatter(int fraction, NumberFormatter formatter) {
        this.formatter = formatter;
        this.fraction = fraction;
    }

    @Override
    public String format(BigDecimal value) {
        final String s = this.formatter.format(value);
        final int index = s.indexOf('.');
        if (index < 0) {
            return s + "." + this.appendZeros("", this.fraction);
        }
        final int n = s.length() - index - 1;
        if (n > this.fraction) {
            return s.substring(0, s.length() - (n - this.fraction));
        }
        return this.appendZeros(s, this.fraction - n);
    }

    private String appendZeros(String s, int n) {
        while (n-- > 0) {
            s += '0';
        }
        return s;
    }
}
