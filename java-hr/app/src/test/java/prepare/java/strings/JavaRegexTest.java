package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaRegexTest {

    @Test
    public void testRegexValidFirstExample() {
        String maybeIP = "000.12.12.034";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertTrue(isValidIP);
    }

    @Test
    public void testRegexValidSecondExample() {
        String maybeIP = "121.234.12.12";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertTrue(isValidIP);
    }

    @Test
    public void testRegexValidThirdExample() {
        String maybeIP = "23.45.12.56";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertTrue(isValidIP);
    }

    @Test
    public void testRegexInvalidFirstExample() {
        String maybeIP = "000.12.234.23.23";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertFalse(isValidIP);
    }

    @Test
    public void testRegexInvalidSecondExample() {
        String maybeIP = "666.666.23.23";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertFalse(isValidIP);
    }

    @Test
    public void testRegexInvalidThirdExample() {
        String maybeIP = ".213.123.23.32";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertFalse(isValidIP);
    }

    @Test
    public void testRegexInvalidFourthExample() {
        String maybeIP = "23.45.22.32.";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertFalse(isValidIP);
    }

    @Test
    public void testRegexInvalidFifthExample() {
        String maybeIP = "I.Am.not.an.ip";
        boolean isValidIP = JavaRegex.MyRegex.isValidIP(maybeIP);
        assertFalse(isValidIP);
    }

}
