package prepare.java.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaSubArrayTest {

    @Test
    public void testSample() {
        int[] a = {1, -2, 4, -5, 1};

        int negativeSubArrays = JavaSubArray.getNumberOfNegativeSubArrays(a);

        assertEquals(9, negativeSubArrays);
    }

    @Test
    public void testNoNegativeValues() {
        int[] a = {1, 2, 4, 5, 1};

        int negativeSubArrays = JavaSubArray.getNumberOfNegativeSubArrays(a);

        assertEquals(0, negativeSubArrays);
    }

    @Test
    public void testAllNegativeValues() {
        int[] a = {-1, -2, -4, -5, -1};

        int negativeSubArrays = JavaSubArray.getNumberOfNegativeSubArrays(a);

        assertEquals(15, negativeSubArrays);
    }

    @Test
    public void testOneNegativeValue() {
        int[] a = {1, 2, -4, 5, 1};

        int negativeSubArrays = JavaSubArray.getNumberOfNegativeSubArrays(a);

        assertEquals(3, negativeSubArrays);
    }

    @Test
    public void testSinglePositiveValue() {
        int[] a = {1};

        int negativeSubArrays = JavaSubArray.getNumberOfNegativeSubArrays(a);

        assertEquals(0, negativeSubArrays);
    }

    @Test
    public void testSingleNegativeValue() {
        int[] a = {-1};

        int negativeSubArrays = JavaSubArray.getNumberOfNegativeSubArrays(a);

        assertEquals(1, negativeSubArrays);
    }
}
