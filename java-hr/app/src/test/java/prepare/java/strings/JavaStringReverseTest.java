package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaStringReverseTest {

    @Test
    public void testSampleInput() {
        String sample = "madam";

        boolean isPalindrome = JavaStringReverse.isPalindrome(sample);

        assertTrue(isPalindrome);
    }

    @Test
    public void testLongerPalindrome() {
        String sample = "omississimo";

        boolean isPalindrome = JavaStringReverse.isPalindrome(sample);

        assertTrue(isPalindrome);
    }

    @Test
    public void testInputNotPalindrome() {
        String sample = "madame";

        boolean isPalindrome = JavaStringReverse.isPalindrome(sample);

        assertFalse(isPalindrome);
    }
}
