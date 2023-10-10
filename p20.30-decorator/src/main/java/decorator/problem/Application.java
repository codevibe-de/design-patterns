package decorator.problem;

import decorator.Currency;
import decorator.NumberFormatter;

import java.io.IOException;
import java.math.BigDecimal;


public class Application {

    public static void main(String[] args) throws IOException {
        demo1();
        demo2();
        demo3();
    }

    static void demo1() {
        final NumberFormatter f = new NumberFractionFormatter(2);
        System.out.println(f.format(BigDecimal.valueOf(3)));
        System.out.println(f.format(BigDecimal.valueOf(3.1)));
        System.out.println(f.format(BigDecimal.valueOf(3.14)));
        System.out.println(f.format(BigDecimal.valueOf(3.141)));
        System.out.println();
    }

    static void demo2() {
        final NumberFormatter f = new NumberFillFormatter(10, '0');
        System.out.println(f.format(BigDecimal.valueOf(3)));
        System.out.println(f.format(BigDecimal.valueOf(3.14)));
        System.out.println();
    }

    static void demo3() {
        final NumberFormatter f = new NumberCurrencyFormatter(Currency.EURO);
        System.out.println(f.format(BigDecimal.valueOf(3)));
        System.out.println(f.format(BigDecimal.valueOf(3.14)));
        System.out.println(f.format(BigDecimal.valueOf(3.141)));
        System.out.println(f.format(BigDecimal.valueOf(12345)));
        System.out.println();
    }

}
