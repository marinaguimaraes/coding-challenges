package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaSubstringComparisonsTest {

    @Test
    public void testSampleInput() {
        String sampleInputS = "welcometojava";
        int sampleInputK = 3;

        String smallestAndLargest = JavaSubstringComparisons.getSmallestAndLargest(sampleInputS, sampleInputK);

        assertEquals("ava\nwel", smallestAndLargest);
    }

    @Test
    public void testCustomInput0() {
        String sampleInputS = "bemvindosaojava";
        int sampleInputK = 2;

        String smallestAndLargest = JavaSubstringComparisons.getSmallestAndLargest(sampleInputS, sampleInputK);

        assertEquals("ao\nvi", smallestAndLargest);
    }
}
