package prepare.java.introduction;

import org.junit.Assert;
import org.junit.Test;

public class JavaIfElseTest {

    @Test
    public void testSampleInputZero() {
        int n = 3;

        String isNumberWeird = JavaIfElse.isNumberWeird(n);

        Assert.assertEquals("Weird", isNumberWeird);
    }

    @Test
    public void testSampleInputOne() {
        int n = 24;

        String isNumberWeird = JavaIfElse.isNumberWeird(n);

        Assert.assertEquals("Not Weird", isNumberWeird);
    }

    @Test
    public void testCustomInputZero() {
        int n = 37;

        String isNumberWeird = JavaIfElse.isNumberWeird(n);

        Assert.assertEquals("Weird", isNumberWeird);
    }

    @Test
    public void testCustomInputOne() {
        int n = 6;

        String isNumberWeird = JavaIfElse.isNumberWeird(n);

        Assert.assertEquals("Weird", isNumberWeird);
    }
}
