package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaSubstringTest {

    @Test
    public void testSubstringSampleInput() {
        String sample = "Helloworld";
        int start = 3;
        int end = 7;

        String substringSample = JavaSubstring.getSubstring(sample, start, end);

        assertEquals("lowo", substringSample);
    }
}
