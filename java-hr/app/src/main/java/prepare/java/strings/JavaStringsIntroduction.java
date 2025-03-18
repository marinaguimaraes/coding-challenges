package prepare.java.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static int sumLengths(String a, String b) {
        return a.length() + b.length();
    }

    public static boolean isAGreaterThanB(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static String getStrFirstLetterUppercase(String a) {
        return a.substring(0,1).toUpperCase() + a.substring(1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        sc.close();

        System.out.println(sumLengths(a,b));
        System.out.println(isAGreaterThanB(a,b) ? "Yes" : "No");
        System.out.println(getStrFirstLetterUppercase(a) + " " + getStrFirstLetterUppercase(b));
    }
}
