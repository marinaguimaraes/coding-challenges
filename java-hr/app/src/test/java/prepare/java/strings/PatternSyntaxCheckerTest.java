package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PatternSyntaxCheckerTest {

    @Test
    public void testSamplePatternZero() {
        String pattern = "([A-Z])(.+)";

        boolean isPatternValid = PatternSyntaxChecker.isPatternValid(pattern);

        assertTrue(isPatternValid);
    }

    @Test
    public void testSamplePatternOne() {
        String pattern = "[AZ[a-z](a-z)";

        boolean isPatternValid = PatternSyntaxChecker.isPatternValid(pattern);

        assertFalse(isPatternValid);
    }

    @Test
    public void testSamplePatternTwo() {
        String pattern = "batcatpat(nat";

        boolean isPatternValid = PatternSyntaxChecker.isPatternValid(pattern);

        assertFalse(isPatternValid);
    }

    @Test
    public void testInvalidEmptyPattern() {
        String pattern = null;

        boolean isPatternValid = PatternSyntaxChecker.isPatternValid(pattern);

        assertFalse(isPatternValid);
    }

    @Test
    public void testInvalidPattern() {
        String pattern = "BOOM\\";

        boolean isPatternValid = PatternSyntaxChecker.isPatternValid(pattern);

        assertFalse(isPatternValid);
    }
}
