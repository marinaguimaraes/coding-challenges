package org.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JavaLoopsIITest {
    @Test
    public void testFirstSampleInput() {
        //given
        int a = 0;
        int b = 2;
        int n = 10;

        //when
        String series = JavaLoopsII.getSeries(a, b, n);

        //then
        assertEquals("2 6 14 30 62 126 254 510 1022 2046", series);
    }

    @Test
    public void testSecondSampleInput() {
        //given
        int a = 5;
        int b = 3;
        int n = 5;

        //when
        String series = JavaLoopsII.getSeries(a, b, n);

        //then
        assertEquals("8 14 26 50 98", series);
    }

}
