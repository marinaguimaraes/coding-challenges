package prepare.java.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaStackTest {

    @Test
    public void testFirstSample() {
        String input = "{}()";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertTrue(isBalanced);
    }

    @Test
    public void testSecondSample() {
        String input = "({()})";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertTrue(isBalanced);
    }

    @Test
    public void testThirdSampleNotBalanced() {
        String input = "{}(";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertFalse(isBalanced);
    }

    @Test
    public void testFourthSample() {
        String input = "[]";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertTrue(isBalanced);
    }

    @Test
    public void testFifthSampleNotBalanced() {
        String input = "{}(";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertFalse(isBalanced);
    }

    @Test
    public void testSixthSampleNotBalanced() {
        String input = "({)}";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertFalse(isBalanced);
    }

    @Test
    public void testCaseOneNotBalanced() {
        String input = "}}}}";

        boolean isBalanced = JavaStack.isBalanced(input);

        assertFalse(isBalanced);
    }

}
