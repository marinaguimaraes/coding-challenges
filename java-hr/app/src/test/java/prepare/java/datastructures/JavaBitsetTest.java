package prepare.java.datastructures;

import org.junit.Test;

import java.util.BitSet;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JavaBitsetTest {

    @Test
    public void executeANDOperation() {
        int initialSize = 5;
        BitSet b1 = new BitSet(initialSize);
        BitSet b2 = new BitSet(initialSize);

        JavaBitset.executeOperation(b1, b2, "AND", 2,1);

        assertEquals(0,b1.cardinality());
        assertEquals(0,b2.cardinality());
    }

    @Test
    public void executeOROperation() {
        int initialSize = 5;
        BitSet b1 = new BitSet(initialSize);
        BitSet b2 = new BitSet(initialSize);

        b1.set(4);
        b2.set(2);

        JavaBitset.executeOperation(b1, b2, "OR", 2,1);

        assertEquals(1,b1.cardinality());
        assertEquals(2,b2.cardinality());
    }

    @Test
    public void executeSETOperation() {
        int initialSize = 5;
        BitSet b1 = new BitSet(initialSize);
        BitSet b2 = new BitSet(initialSize);

        JavaBitset.executeOperation(b1, b2, "SET", 1,4);

        assertEquals(1,b1.cardinality());
        assertTrue(b1.get(4));
        assertEquals(0,b2.cardinality());
    }

    @Test
    public void executeFLIPOperation() {
        int initialSize = 5;
        BitSet b1 = new BitSet(initialSize);
        BitSet b2 = new BitSet(initialSize);

        JavaBitset.executeOperation(b1, b2, "FLIP", 2,2);

        assertEquals(0,b1.cardinality());
        assertTrue(b2.get(2));
        assertEquals(1,b2.cardinality());
    }

    @Test
    public void testCase3() {
        int initialSize = 10;
        BitSet b1 = new BitSet(initialSize);
        BitSet b2 = new BitSet(initialSize);

        JavaBitset.executeOperation(b1, b2, "AND", 1,2);
        JavaBitset.executeOperation(b1, b2, "XOR", 1,2);
        JavaBitset.executeOperation(b1, b2, "XOR", 1,2);
        JavaBitset.executeOperation(b1, b2, "AND", 2,1);
        JavaBitset.executeOperation(b1, b2, "XOR", 1,2);
        JavaBitset.executeOperation(b1, b2, "SET", 1,1);
        JavaBitset.executeOperation(b1, b2, "SET", 1,0);

        assertEquals(2,b1.cardinality());
        assertTrue(b1.get(0));
        assertTrue(b1.get(1));
        assertEquals(0,b2.cardinality());
    }




}
