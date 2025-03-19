package prepare.java.strings;

import java.util.Scanner;

public class JavaSubstring {
    public static String getSubstring(String fromString, int start, int end) {
        return fromString.substring(start, end);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        in.close();

        System.out.println(getSubstring(str, start, end));
    }
}
