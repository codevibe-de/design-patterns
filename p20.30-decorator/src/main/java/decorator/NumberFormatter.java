package decorator;

import java.math.BigDecimal;


public class NumberFormatter {

    public String format(BigDecimal value) {
        return value.toString();
    }

}

