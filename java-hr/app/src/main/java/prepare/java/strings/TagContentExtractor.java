package prepare.java.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static final String NONE = "None";

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
            String line = in.nextLine();

            System.out.println(extractContent(line));

            testCases--;
        }
    }

    public static String extractContent(String input) {
        String pattern = "<(?<tag>.+)>(?<content>[^<>]+)</\\k<tag>>";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(input);

        StringBuilder contentToReturn = new StringBuilder();

        while (m.find()) {
            if (contentToReturn.isEmpty()) {
                contentToReturn.append(m.group("content"));
            } else {
                contentToReturn.append("\n").append(m.group("content"));
            }
        }

        if (contentToReturn.isEmpty()) {
            return NONE;
        }

        return contentToReturn.toString();
    }
}
