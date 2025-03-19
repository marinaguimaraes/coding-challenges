package prepare.java.strings;

public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String string, int substringSize) {
        String smallestSubstring = "";
        String largestSubstring = "";
        for (int i=0; i < string.length()-(substringSize-1); i++) {
            String currentSubstring = string.substring(i,i+substringSize);
            if (smallestSubstring.compareTo(currentSubstring) > 0 || smallestSubstring.isEmpty()) {
                smallestSubstring = currentSubstring;
            }
            if (largestSubstring.compareTo(currentSubstring) < 0 || smallestSubstring.isEmpty()) {
                largestSubstring = currentSubstring;
            }
        }

        return smallestSubstring + "\n" + largestSubstring;
    }
}
