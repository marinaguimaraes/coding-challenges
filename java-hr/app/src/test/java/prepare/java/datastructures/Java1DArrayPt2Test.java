package prepare.java.datastructures;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Java1DArrayPt2Test {

    @Test
    public void testCanWinSample0() {
        int[] game = {0,0,0,0,0};
        int leap = 3;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinSample1() {
        int[] game = {0,0,0,1,1,1};
        int leap = 5;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinSample2() {
        int[] game = {0,0,1,1,1,0};
        int leap = 3;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertFalse(canWin);
    }

    @Test
    public void testCanWinSample3() {
        int[] game = {0,1,0};
        int leap = 1;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertFalse(canWin);
    }


    @Test
    public void testCanWinCustom0() {
        int[] game = {0,1,1,1,1,1};
        int leap = 6;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinTestCase2() {
        int[] game = {0,1,1,0,0,1,1,0,1};
        int leap = 4;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinTestCase3Game1() {
        int[] game = {0,0,0,0,0,1,0,1,0};
        int leap = 41;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinTestCase3Game2() {
        int[] game = {0,1,1,0,0,1,0,0,0,1,0,1,1};
        int leap = 8;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinTestCase3Game3() {
        int[] game = {0,0,1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1,1,0,1,0,0,1,0,1,1,0,0,1,0,0,0,1,1,0,1,1,0,1,0,1,1,0,0,1,0,0,0,1,0,0,1,0,1,0,1,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,1,0,0,1,0,1};
        int leap = 5;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertFalse(canWin);
    }

    @Test
    public void testCanWinTestCase3Game30() {
        int[] game = {0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1};
        int leap = 57;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinTestCase3Game96() {
        int[] game = {0,0,1,1,0,0,0,0,0,0,0,0,0,1,0,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,0,1,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,1,0,0,0,1,1,1};
        int leap = 3;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertFalse(canWin);
    }

    @Test
    public void testCanWinTestCase3Game48() {
        // 84 14
        int[] game = {0,0,0,0,0,1,0,1,1,1,1,0,1,0,1,0,0,1,0,0,0,1,0,1,0,0,0,0,1,1,0,0,1,0,0,1,1,1,1,0,0,0,0,0,0,1,0,0,0,0,0,1,1,0,0,1,1,1,0,0,0,0,1,0,0,1,1,1,0,0,1,1,1,1,1,1,1,1,0,1,1,0,0,0};
        // 5*0
        // 1*1
        // 1*0
        //
        int leap = 14;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinBlockOfZeroesDeadEnd() {
        int[] game = {0,0,0,1,0,0,1,0,0,1,1,1,0};
        int leap = 5;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinLeap0() {
        int[] game = {0,0,0,1,0,0,1,0,0,1,1,1,0};
        int leap = 0;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertFalse(canWin);
    }

    @Test
    public void testCanWinLeap1() {
        int[] game = {0,0,0,1,0,0,1,0,0,1,1,1,0};
        int leap = 1;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertFalse(canWin);
    }

    @Test
    public void testCanWinCase3Test233() {
        // 62 26
        int[] game = {0,1,0,1,1,0,1,0,1,0,0,0,0,1,1,1,0,0,0,0,0,1,0,0,0,0,0,1,1,1,1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,1,0,0,1,1,0,0,1,0,0,0,1,1,0};
        int leap = 26;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

    @Test
    public void testCanWinOnlyZeroesLeapZero() {
//        4 0
        int[] game = {0,0,0,0};
        int leap = 0;

        boolean canWin = Java1DArrayPt2.canWin(leap, game);

        assertTrue(canWin);
    }

}
