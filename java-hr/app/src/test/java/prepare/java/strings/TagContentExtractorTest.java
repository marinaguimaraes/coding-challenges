package prepare.java.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TagContentExtractorTest {

    @Test
    public void testSampleInputOneTag() {
        String input = "<h1>Nayeem loves counseling</h1>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("Nayeem loves counseling", extractedContent);
    }

    @Test
    public void testSampleInputSequentialAndNestedTags() {
        String input = "<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("Sanjay has no watch\n" +
                "So wait for a while", extractedContent);
    }

    @Test
    public void testInputSequentialTags() {
        String input = "<h1>Sanjay has no watch</h1><par>So wait for a while</par><h2>Third line</h2>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("Sanjay has no watch\n" +
                "So wait for a while\n" +
                "Third line", extractedContent);
    }

    @Test
    public void testSampleInputNoValidTags() {
        String input = "<Amee>safat codes like a ninja</amee>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("None", extractedContent);
    }

    @Test
    public void testSampleInputOneTagCustomName() {
        String input = "<SA premium>Imtiaz has a secret crush</SA premium>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("Imtiaz has a secret crush", extractedContent);
    }

    @Test
    public void testTenNestedTags() {
        String input = "<h1><h1><h1><h1><h1><h1><h1><h1><h1><h1>Sanjay has no watch</h1></h1></h1></h1></h1></h1></h1></h1></h1></h1>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("Sanjay has no watch", extractedContent);
    }

    @Test
    public void testContentBetweenNestedTags() {
        String input = "<h1><a>contents</a>invalid</h1>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("contents", extractedContent);
    }

    @Test
    public void testInvalidTagsWithinContent() {
        String input = "<h1>had<h1>public</h1515></h1>";
        String extractedContent = TagContentExtractor.extractContent(input);

        assertEquals("None", extractedContent);
    }

}
