package prepare.java.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        if (N > 0) {
            for (int i = 0; i < N; i++) {
                String pattern = scanner.nextLine();
                System.out.println(isPatternValid(pattern) ? "Valid" : "Invalid");
            }
        }

        scanner.close();
    }

    static boolean isPatternValid(String pattern) {
        if (pattern == null || pattern.isEmpty())
            return false;

        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}
