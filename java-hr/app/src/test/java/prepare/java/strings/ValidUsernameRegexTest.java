package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidUsernameRegexTest {

    @Test
    public void testInvalidUsernameLength() {
        String username = "Julia";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertFalse(isUsernameValid);
    }

    @Test
    public void testValidUsername0() {
        String username = "Samantha";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertTrue(isUsernameValid);
    }

    @Test
    public void testValidUsername1() {
        String username = "Samantha_21";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertTrue(isUsernameValid);
    }

    @Test
    public void testInvalidUsernameStartsWithDigit() {
        String username = "1Samantha";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertFalse(isUsernameValid);
    }

    @Test
    public void testInvalidUsernameForbiddenChar() {
        String username = "Samantha?10_2A";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertFalse(isUsernameValid);
    }

    @Test
    public void testValidUsername2() {
        String username = "JuliaZ007";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertTrue(isUsernameValid);
    }

    @Test
    public void testInvalidUsernameForbiddenChar1() {
        String username = "Julia@007";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertFalse(isUsernameValid);
    }

    @Test
    public void testInvalidUsernameStartsWithUnderscore() {
        String username = "_Julia007";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertFalse(isUsernameValid);
    }

    @Test
    public void testValidUsername3() {
        String username = "AnExampleOf_long_username_123";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertTrue(isUsernameValid);
    }

    @Test
    public void testInvalidUsernameTooLong() {
        String username = "AnExampleOf_too_long_username_3";
        boolean isUsernameValid = ValidUsernameRegex.matchesUsernameRegex(username);
        assertFalse(isUsernameValid);
    }
}
