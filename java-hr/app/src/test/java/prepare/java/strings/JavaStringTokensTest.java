package prepare.java.strings;

import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JavaStringTokensTest {

    @Test
    public void testSampleInput() {
        String sampleInput = "He is a very very good boy, isn't he?";

        List<String> result = JavaStringTokens.getStringTokens(sampleInput);

        assertEquals(10, result.size());
        assertEquals("He", result.get(0));
        assertEquals("is", result.get(1));
        assertEquals("a", result.get(2));
        assertEquals("very", result.get(3));
        assertEquals("very", result.get(4));
        assertEquals("good", result.get(5));
        assertEquals("boy", result.get(6));
        assertEquals("isn", result.get(7));
        assertEquals("t", result.get(8));
        assertEquals("he", result.get(9));
    }

    @Test
    public void testCustomInput() {
        String sampleInput = "Let's hope this works, @right? Right!";

        List<String> result = JavaStringTokens.getStringTokens(sampleInput);

        assertEquals(7, result.size());
    }

    @Test
    public void testCustomInputOnlySymbols() {
        String sampleInput = " @ . , ? ! _";

        List<String> result = JavaStringTokens.getStringTokens(sampleInput);

        assertEquals(0, result.size());
    }
}
