/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloJavaTest {
    @Test public void appHasAGreeting() {
        HelloJava classUnderTest = new HelloJava();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
