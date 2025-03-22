package prepare.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegexDuplicateWords {

    // I have duplicated logic here because first I wrote this method to be able to test it.
    // Then I realised the Hackerrank challenge had a pre-written code and a check for exact 3 modifications from
    // the main method, and now I don't want to remove removeDuplicateWords because I'd have to delete the tests.
    static String removeDuplicateWords(String input) {
        String pattern = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);

        Matcher m = p.matcher(input);

        while (m.find()) {
            // Capturing groups are indexed from left to right, starting at one.
            // Group zero denotes the entire pattern
            input = input.replaceAll(m.group(0),m.group(1));
        }

        return input;
    }

    public static void main(String[] args) {

        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0),m.group(1));
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }
}
