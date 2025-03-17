package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = format(Locale.US, payment);

        // Hackerrank does not recognize Locale.of(). Use the deprecated method: new Locale("en","IN")
        String india = format(Locale.of("en","IN"), payment);

        String china = format(Locale.CHINA, payment);
        String france = format(Locale.FRANCE, payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

    static String format(Locale locale, double payment) {
        // Post submission note: I thought I was insane trying to substitute all of those chars,
        // Hackerrank was still not accepting it. I changed the environment to Java 7 and the solution
        // worked without any replacements. Thanks for the time wasted, Hackerrank

        return NumberFormat.getCurrencyInstance(locale).format(payment)
                .replaceAll("\u00a0","\u0020")
                .replaceAll("\u202F", "\u0020")
                .replace("\u20B9","Rs.") // Indian Rupee - Hackerrank uses the old notation
                .replace("\u00A5", "\uFFE5"); // two Yen chars, because Hackerrank is crying again
    }
}
