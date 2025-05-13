package prepare.java.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class JavaDequeueTest {

    @Test
    public void testSample() {
        int n=6;
        int m=3;
        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(5,3,5,2,3,2));

        int maxUniqueIntegers = JavaDequeue.getMaxUniqueIntegers(n,m,inputList);

        assertEquals(3, maxUniqueIntegers);
    }

    @Test
    public void testSubsetSizeOne() {
        int n=30;
        int m=1;
        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(5,3,5,2,3,5,3,5,2,3,5,3,5,2,3,5,3,5,2,3,5,3,5,2,3,5,3,5,2,3));

        int maxUniqueIntegers = JavaDequeue.getMaxUniqueIntegers(n,m,inputList);

        assertEquals(1, maxUniqueIntegers);
    }

    @Test
    public void testSubsetSizeN() {
        int n=6;
        int m=6;
        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(5,3,5,2,3,2));

        int maxUniqueIntegers = JavaDequeue.getMaxUniqueIntegers(n,m,inputList);

        assertEquals(3, maxUniqueIntegers);
    }

    @Test
    public void testManyRepeatedNumbers() {
        int n=20;
        int m=5;
        ArrayList<Integer> inputList = new ArrayList<>(Arrays.asList(1,1,1,1,2,1,1,1,1,3,1,1,1,1,3,1,1,1,1,4));

        int maxUniqueIntegers = JavaDequeue.getMaxUniqueIntegers(n,m,inputList);

        assertEquals(2, maxUniqueIntegers);
    }
}
