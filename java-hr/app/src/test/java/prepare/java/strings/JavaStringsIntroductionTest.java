package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaStringsIntroductionTest {

    @Test
    public void testSumLengths() {
        String a = "good";
        String b = "morning";

        int sumLengths = JavaStringsIntroduction.sumLengths(a,b);

        assertEquals(11, sumLengths);
    }

    @Test
    public void testIsAGreaterThanB() {
        String a = "good";
        String b = "morning";

        boolean isAGreaterThanB = JavaStringsIntroduction.isAGreaterThanB(a,b);

        assertFalse(isAGreaterThanB);
    }

    @Test
    public void testFirstLetterUppercase() {
        String a = "good";
        String b = "morning";

        String firstLetterUppercaseA = JavaStringsIntroduction.getStrFirstLetterUppercase(a);
        String firstLetterUppercaseB = JavaStringsIntroduction.getStrFirstLetterUppercase(b);

        assertEquals("Good", firstLetterUppercaseA);
        assertEquals("Morning", firstLetterUppercaseB);
    }
}
