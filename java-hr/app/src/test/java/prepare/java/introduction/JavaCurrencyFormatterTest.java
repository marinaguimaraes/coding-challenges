package prepare.java.introduction;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class JavaCurrencyFormatterTest {

    @Test
    public void testUSCurrencyFormat() {
        double payment = 12324.134;
        String currencyUS = JavaCurrencyFormatter.format(Locale.US, payment);

        assertEquals("$12,324.13", currencyUS);
    }

    @Test
    public void testIndiaCurrencyFormat() {
        double payment = 12324.134;
        String currencyIndia = JavaCurrencyFormatter.format(Locale.of("en","IN"), payment);

        assertEquals("Rs.12,324.13", currencyIndia);
    }

    @Test
    public void testFranceCurrencyFormat() {
        double payment = 12324.134;
        String currencyFrance = JavaCurrencyFormatter.format(Locale.FRANCE, payment);

        assertEquals("12 324,13 €", currencyFrance);
        assertTrue(currencyFrance.contains("\u20AC"));
    }

    @Test
    public void testChinaCurrencyFormat() {
        double payment = 12324.134;
        String currencyChina = JavaCurrencyFormatter.format(Locale.CHINA, payment);

        assertEquals("￥12,324.13", currencyChina);
        assertFalse(currencyChina.contains("\u00A5")); // ¥
        assertTrue(currencyChina.contains("\uFFE5")); // ¥
    }
}
