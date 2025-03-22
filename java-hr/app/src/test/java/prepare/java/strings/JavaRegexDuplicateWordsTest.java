package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaRegexDuplicateWordsTest {

    @Test
    public void testSample0() {
        String original = "Goodbye bye bye world world world";
        String result = JavaRegexDuplicateWords.removeDuplicateWords(original);

        assertEquals("Goodbye bye world", result);
    }

    @Test
    public void testSample1() {
        String original = "Sam went went to to to his business";
        String result = JavaRegexDuplicateWords.removeDuplicateWords(original);

        assertEquals("Sam went to his business", result);
    }

    @Test
    public void testSample2() {
        String original = "Reya is is the the best player in eye eye game";
        String result = JavaRegexDuplicateWords.removeDuplicateWords(original);

        assertEquals("Reya is the best player in eye game", result);
    }

    @Test
    public void testSample3() {
        String original = "in inthe";
        String result = JavaRegexDuplicateWords.removeDuplicateWords(original);

        assertEquals("in inthe", result);
    }

    @Test
    public void testSample4() {
        String original = "Hello hello Ab aB";
        String result = JavaRegexDuplicateWords.removeDuplicateWords(original);

        assertEquals("Hello Ab", result);
    }
}
