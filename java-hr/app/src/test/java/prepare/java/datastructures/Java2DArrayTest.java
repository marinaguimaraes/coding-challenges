package prepare.java.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Java2DArrayTest {

    @Test
    public void calculateHourglass() {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> arrRow0 = new ArrayList<>(Arrays.asList(1,1,1));
        List<Integer> arrRow1 = new ArrayList<>(Arrays.asList(0,1,0));
        List<Integer> arrRow2 = new ArrayList<>(Arrays.asList(1,1,1));

        arr.add(arrRow0);
        arr.add(arrRow1);
        arr.add(arrRow2);

        int hourglassSum = Java2DArray.calculateHourGlassSum(arr, 0, 0);

        assertEquals(7, hourglassSum);

    }

    @Test
    public void testSampleInput() {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> arrRow0 = new ArrayList<>(Arrays.asList(1,1,1,0,0,0));
        List<Integer> arrRow1 = new ArrayList<>(Arrays.asList(0,1,0,0,0,0));
        List<Integer> arrRow2 = new ArrayList<>(Arrays.asList(1,1,1,0,0,0));
        List<Integer> arrRow3 = new ArrayList<>(Arrays.asList(0,0,2,4,4,0));
        List<Integer> arrRow4 = new ArrayList<>(Arrays.asList(0,0,0,2,0,0));
        List<Integer> arrRow5 = new ArrayList<>(Arrays.asList(0,0,1,2,4,0));

        arr.add(arrRow0);
        arr.add(arrRow1);
        arr.add(arrRow2);
        arr.add(arrRow3);
        arr.add(arrRow4);
        arr.add(arrRow5);

        int hourglassSum = Java2DArray.calculateMaxHourglassSum(arr);

        assertEquals(19, hourglassSum);
    }

    @Test
    public void testCustomInputNegatives() {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> arrRow0 = new ArrayList<>(Arrays.asList(-1,-1,-1,-2,-2,-2));
        List<Integer> arrRow1 = new ArrayList<>(Arrays.asList( 0,-1, 0,-2, 0, 0));
        List<Integer> arrRow2 = new ArrayList<>(Arrays.asList( 1, 1, 1, 0, 2, 0));
        List<Integer> arrRow3 = new ArrayList<>(Arrays.asList( 8, 2, 1,-3, 1, 7));
        List<Integer> arrRow4 = new ArrayList<>(Arrays.asList(-9, 1,-2, 2, 3, 0));
        List<Integer> arrRow5 = new ArrayList<>(Arrays.asList( 0, 0, 1, 9,-9, 0));

        arr.add(arrRow0);
        arr.add(arrRow1);
        arr.add(arrRow2);
        arr.add(arrRow3);
        arr.add(arrRow4);
        arr.add(arrRow5);

        int hourglassSum = Java2DArray.calculateMaxHourglassSum(arr);

        assertEquals(13, hourglassSum);
    }
}
