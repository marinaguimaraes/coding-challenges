package prepare.java.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaTryCatch {
    public static String divide(int x, int y) {
        int result;

        try {
            result = x / y;
        } catch (ArithmeticException e) {
            return e.getClass().getName() + ": " + e.getMessage();
        }

        return String.valueOf(result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            String result = divide(x,y);
            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }

        scanner.close();
    }
}
