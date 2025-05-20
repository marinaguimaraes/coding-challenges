package prepare.java.exceptionhandling;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaTryCatchTest {

    @Test
    public void testSample0() {
        //Sample Input 0: 10 3
        //### Sample Output 0: 3
        int x = 10;
        int y = 3;

        String result = JavaTryCatch.divide(x,y);

        assertEquals("3", result);
    }

    @Test
    public void testSample2() {
        //Sample Input 2: 10 0
        //### Sample Output 2: java.lang.ArithmeticException: / by zero
        int x = 10;
        int y = 0;

        String result = JavaTryCatch.divide(x,y);

        assertEquals("java.lang.ArithmeticException: / by zero", result);
    }

}
