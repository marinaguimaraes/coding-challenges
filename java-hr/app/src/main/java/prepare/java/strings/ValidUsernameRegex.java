package prepare.java.strings;

import java.util.Scanner;

public class ValidUsernameRegex {
    public static final String regularExpression = "^[A-Za-z]\\w{7,29}";

    public static boolean matchesUsernameRegex(String username) {
        return username.matches(ValidUsernameRegex.regularExpression);
    }
}


class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(ValidUsernameRegex.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}