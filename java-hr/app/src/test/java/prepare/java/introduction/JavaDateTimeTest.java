package prepare.java.introduction;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class JavaDateTimeTest {

    @Test
    public void testInputSample() {
        int month = 8;
        int day = 14;
        int year = 2017;

        String dayOfWeek = JavaDateTime.Result.findDay(month,day,year);

        assertEquals("MONDAY", dayOfWeek);
    }

    @Test
    public void testSecondInputSample() {
        int month = 8;
        int day = 5;
        int year = 2015;

        String dayOfWeek = JavaDateTime.Result.findDay(month,day,year);

        assertEquals("WEDNESDAY", dayOfWeek);
    }
}
