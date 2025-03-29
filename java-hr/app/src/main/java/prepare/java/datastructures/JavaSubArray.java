package prepare.java.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JavaSubArray {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        int[] a = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        System.out.println(getNumberOfNegativeSubArrays(a));
    }

    public static int getNumberOfNegativeSubArrays(int[] a) {
        int numberOfNegativeSubArrays = 0;

        for (int start=0; start < a.length; start++) {
            for (int end=start+1; end <= a.length; end++) {
                int[] copy = Arrays.copyOfRange(a, start, end); //start=inclusive, end=exclusive
                int currentSum = Arrays.stream(copy).sum();
                if (currentSum < 0) {
                    numberOfNegativeSubArrays++;
                }
            }
        }

        return numberOfNegativeSubArrays;
    }
}
