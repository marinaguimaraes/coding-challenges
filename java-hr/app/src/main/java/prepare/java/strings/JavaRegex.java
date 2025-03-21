package prepare.java.strings;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            System.out.println(MyRegex.isValidIP(input));
        }
        scanner.close();
    }

    static class MyRegex {
        private static final String pattern = "([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})\\.([0-9]{1,3})";

        public static boolean isValidIP(String ip) {
            if (!ip.matches(pattern)) return false;

            String[] parts = ip.split("\\.");
            for (String part : parts) {
                if (Integer.parseInt(part) > 255) return false;
            }
            return true;
        }
    }
}
