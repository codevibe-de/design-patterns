package decorator.problem;

import decorator.NumberFormatter;

import java.math.BigDecimal;

public class NumberFillFormatter extends NumberFormatter {

    private final int length;
    private final char fillChar;

    public NumberFillFormatter(final int length, final char fillChar) {
        this.length = length;
        this.fillChar = fillChar;
    }

    @Override
    public String format(BigDecimal value) {
        final String s = super.format(value);
        if (s.length() < this.length) {
            return this.prependFillChars(s, this.length - s.length());
        }
        return s;
    }

    private String prependFillChars(String s, int n) {
        while (n-- > 0) {
            s = this.fillChar + s;
        }
        return s;
    }

}
