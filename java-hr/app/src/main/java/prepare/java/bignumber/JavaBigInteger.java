package prepare.java.bignumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class JavaBigInteger {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();

        System.out.println(add(a,b));
        System.out.println(multiply(a,b));

        bufferedReader.close();
    }

    static BigInteger multiply(String a, String b) {
        BigInteger numberA = new BigInteger(a);
        BigInteger numberB = new BigInteger(b);
        return numberA.multiply(numberB);
    }

    static BigInteger add(String a, String b) {
        BigInteger numberA = new BigInteger(a);
        BigInteger numberB = new BigInteger(b);
        return numberA.add(numberB);
    }
}
