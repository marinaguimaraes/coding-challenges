package prepare.java.bignumber;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JavaPrimalityTest {

    @Test
    public void testPrimeNumber13() {
        String number = String.valueOf(13);

        boolean isPrime = JavaPrimality.isPrime(number);

        assertTrue(isPrime);
    }

    @Test
    public void testPrimeNumber73() {
        String number = String.valueOf(73);

        boolean isPrime = JavaPrimality.isPrime(number);

        assertTrue(isPrime);
    }

    @Test
    public void testCompositeNumber91() {
        String number = String.valueOf(91);

        boolean isPrime = JavaPrimality.isPrime(number);

        assertFalse(isPrime);
    }

    @Test
    public void testCompositeNumber703() {
        String number = String.valueOf(703);

        boolean isPrime = JavaPrimality.isPrime(number);

        assertFalse(isPrime);
    }

    @Test
    public void testCompositeNumber1891() {
        String number = String.valueOf(1891);

        boolean isPrime = JavaPrimality.isPrime(number);

        assertFalse(isPrime);
    }

    @Test
    public void testCompositeNumber123891723() {
        String number = String.valueOf(123891723);

        boolean isPrime = JavaPrimality.isPrime(number);

        assertFalse(isPrime);
    }


    @Test
    public void testPrimeNumberAbsurdlyBig() {
        String number = "9154382434687345559322490494401619371977502619527868292475201438676916642062674825927070594489876179";

        boolean isPrime = JavaPrimality.isPrime(number);

        assertTrue(isPrime);
    }


    @Test
    public void testCompositeNumberAbsurdlyBig() {
        String number = "4072645018784130241870502028859644269550285928559553144475495121387545302527669623764601674757426914";

        boolean isPrime = JavaPrimality.isPrime(number);

        assertFalse(isPrime);
    }

}
