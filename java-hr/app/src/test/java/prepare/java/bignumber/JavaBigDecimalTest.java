package prepare.java.bignumber;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static org.junit.Assert.assertEquals;

public class JavaBigDecimalTest {

    @Test
    public void testSampleInput() {
        int n = 9;
        String[] s = new String[]{"-100", "50", "0", "56.6", "90", "0.12", ".12", "02.34", "000.000", null, null};

        JavaBigDecimal.sortArray(n, s);

        assertEquals("90", s[0]);
        assertEquals("56.6", s[1]);
        assertEquals("50", s[2]);
    }

    @Test
    public void testInputMultipleEquivalentValues() {
        int n = 7;
        String[] s = new String[]{"-100", "-100.00", "0.00", "000.000", "-0100", "0.0", ".0", null, null};

        JavaBigDecimal.sortArray(n, s);

        assertEquals("0.00", s[0]);
        assertEquals("000.000", s[1]);
        assertEquals("0.0", s[2]);
        assertEquals(".0", s[3]);
        assertEquals("-100", s[4]);
        assertEquals("-100.00", s[5]);
        assertEquals("-0100", s[6]);
    }

}
