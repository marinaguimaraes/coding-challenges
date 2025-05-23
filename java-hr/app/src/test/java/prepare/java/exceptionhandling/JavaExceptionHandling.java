package prepare.java.exceptionhandling;

import java.util.Scanner;
class MyCalculator {
    public long power(int n, int p) throws Exception {
       long power = n;

       if (n == 0 && p == 0) {
           throw new Exception("n and p should not be zero.");
       }
       if (n < 0 || p < 0) {
           throw new Exception("n or p should not be negative.");
       }

       if (p == 0) {
           return 1;
       }

       for (int i=1; i<p; i++) {
           power *= n;
       }
       return power;
    }

}

public class JavaExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
