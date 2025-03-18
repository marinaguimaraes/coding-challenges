package org.example;

import java.util.*;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        System.out.println(isNumberWeird(n));
    }

    public static String isNumberWeird(int n) {
        String weird = "Weird";
        String notWeird = "Not Weird";

        if (n % 2 == 1) {
            return weird;
        } else {
            if (n >= 2 && n <= 5) {
                return notWeird;
            }
            if (n >= 6 && n <= 20) {
                return weird;
            }
            return notWeird;
        }
    }
}
