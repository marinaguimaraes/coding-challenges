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
    public void testIsAGreaterThanBReturnFalse() {
        String a = "good";
        String b = "morning";

        boolean isAGreaterThanB = JavaStringsIntroduction.isAGreaterThanB(a,b);

        assertFalse(isAGreaterThanB);
    }

    @Test
    public void testIsAGreaterThanBSameStrings() {
        String a = "hello";
        String b = "hello";

        boolean isAGreaterThanB = JavaStringsIntroduction.isAGreaterThanB(a,b);

        assertFalse(isAGreaterThanB);
    }

    @Test
    public void testIsAGreaterThanBReturnTrue() {
        String a = "zebra";
        String b = "arara";

        boolean isAGreaterThanB = JavaStringsIntroduction.isAGreaterThanB(a,b);

        assertTrue(isAGreaterThanB);
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
