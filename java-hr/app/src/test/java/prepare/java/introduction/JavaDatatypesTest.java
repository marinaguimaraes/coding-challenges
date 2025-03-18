package prepare.java.introduction;

import org.junit.Test;

import static org.junit.Assert.*;

public class JavaDatatypesTest {

    @Test
    public void testFirstSampleInput() {
        long n = -150;

        boolean fitsInByte = JavaDatatypes.fitsInByte(n);
        boolean fitsInShort = JavaDatatypes.fitsInShort(n);
        boolean fitsInInt = JavaDatatypes.fitsInInt(n);

        assertFalse(fitsInByte);
        assertTrue(fitsInShort);
        assertTrue(fitsInInt);
    }

    @Test
    public void testSecondSampleInput() {
        long n = 150000;

        boolean fitsInByte = JavaDatatypes.fitsInByte(n);
        boolean fitsInShort = JavaDatatypes.fitsInShort(n);
        boolean fitsInInt = JavaDatatypes.fitsInInt(n);

        assertFalse(fitsInByte);
        assertFalse(fitsInShort);
        assertTrue(fitsInInt);
    }

    @Test
    public void testThirdSampleInput() {
        long n = 1500000000;

        boolean fitsInByte = JavaDatatypes.fitsInByte(n);
        boolean fitsInShort = JavaDatatypes.fitsInShort(n);
        boolean fitsInInt = JavaDatatypes.fitsInInt(n);

        assertFalse(fitsInByte);
        assertFalse(fitsInShort);
        assertTrue(fitsInInt);
    }

    @Test
    public void testExtraInput() {
        long n = -5;

        boolean fitsInByte = JavaDatatypes.fitsInByte(n);
        boolean fitsInShort = JavaDatatypes.fitsInShort(n);
        boolean fitsInInt = JavaDatatypes.fitsInInt(n);

        assertTrue(fitsInByte);
        assertTrue(fitsInShort);
        assertTrue(fitsInInt);
    }
}
