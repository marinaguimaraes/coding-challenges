package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaAnagramsTest {

    @Test
    public void testAnagramsSampleZero() {
        String a = "anagram";
        String b = "margana";

        boolean isAnagram = JavaAnagrams.isAnagram(a, b);

        assertTrue(isAnagram);
    }

    @Test
    public void testAnagramsSampleOne() {
        String a = "anagramm";
        String b = "marganaa";

        boolean isAnagram = JavaAnagrams.isAnagram(a, b);

        assertFalse(isAnagram);
    }

    @Test
    public void testAnagramsSampleTwo() {
        String a = "Hello";
        String b = "hello";

        boolean isAnagram = JavaAnagrams.isAnagram(a, b);

        assertTrue(isAnagram);
    }

    @Test
    public void testAnagramsCustom() {
        String a = "NorTH";
        String b = "tHorN";

        boolean isAnagram = JavaAnagrams.isAnagram(a, b);

        assertTrue(isAnagram);
    }

    @Test
    public void testNotAnagramsCustom() {
        String a = "begin";
        String b = "beings";

        boolean isAnagram = JavaAnagrams.isAnagram(a, b);

        assertFalse(isAnagram);
    }
}
