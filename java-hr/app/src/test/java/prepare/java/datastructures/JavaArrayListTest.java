package prepare.java.datastructures;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JavaArrayListTest {

    @Test
    public void testSampleInputFirstQuery() {
        ArrayList<List<Integer>> lines = getLinesSample();

        Integer value = JavaArrayList.findValueInPosition(lines, 1, 3);

        assert value != null;
        assertEquals(74, value.intValue());
    }

    @Test
    public void testSampleInputSecondQuery() {
        ArrayList<List<Integer>> lines = getLinesSample();

        Integer value = JavaArrayList.findValueInPosition(lines, 3, 4);

        assert value != null;
        assertEquals(52, value.intValue());
    }

    @Test
    public void testSampleInputThirdQuery() {
        ArrayList<List<Integer>> lines = getLinesSample();

        Integer value = JavaArrayList.findValueInPosition(lines, 3, 1);

        assert value != null;
        assertEquals(37, value.intValue());
    }

    @Test
    public void testSampleInputFourthQuery() {
        ArrayList<List<Integer>> lines = getLinesSample();

        Integer value = JavaArrayList.findValueInPosition(lines, 4, 3);

        assert value == null;
    }

    @Test
    public void testSampleInputFifthQuery() {
        ArrayList<List<Integer>> lines = getLinesSample();

        Integer value = JavaArrayList.findValueInPosition(lines, 5, 5);

        assert value == null;
    }

    private static ArrayList<List<Integer>> getLinesSample() {
        List<Integer> firstLine = List.of(5, 41, 77, 74, 22, 44);
        List<Integer> secondLine = List.of(1, 12);
        List<Integer> thirdLine = List.of(4, 37, 34, 36, 52);
        List<Integer> fourthLine = List.of(0);
        List<Integer> fifthLine = List.of(3, 20, 22, 33);

        ArrayList<List<Integer>> lines = new ArrayList<>();
        lines.add(firstLine);
        lines.add(secondLine);
        lines.add(thirdLine);
        lines.add(fourthLine);
        lines.add(fifthLine);
        return lines;
    }
}
