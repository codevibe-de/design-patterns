package decorator.solution;

import decorator.NumberFormatter;

import java.math.BigDecimal;

public class NumberFillFormatter extends NumberFormatter {

    private final NumberFormatter formatter;
    private final int length;
    private final char fillChar;

    public NumberFillFormatter(final int length, final char fillChar, final NumberFormatter formatter) {
        this.formatter = formatter;
        this.length = length;
        this.fillChar = fillChar;
    }

    @Override
    public String format(BigDecimal value) {
        final String s = this.formatter.format(value);
		if (s.length() < this.length) {
			return this.prependFillChars(s, this.length - s.length());
		}
        return s;
    }

    private String prependFillChars(String s, int n) {
        while (n-- > 0)
            s = this.fillChar + s;
        return s;
    }
}
