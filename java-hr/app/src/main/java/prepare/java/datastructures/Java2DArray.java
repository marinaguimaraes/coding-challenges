package prepare.java.datastructures;

import java.io.*;
import java.util.*;

public class Java2DArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int maxHourglassSum = calculateMaxHourglassSum(arr);

        System.out.println(maxHourglassSum);

        bufferedReader.close();
    }

    public static int calculateMaxHourglassSum(List<List<Integer>> arr) {
        int maxHourglassSum = -63; // if all numbers of hourglass are -9
        for (int i=0; i<4; i++) {
            for (int j=0; j<4; j++) {
                int currentHourglassSum = calculateHourGlassSum(arr, i, j);
                if (currentHourglassSum > maxHourglassSum) {
                    maxHourglassSum = currentHourglassSum;
                }
            }
        }
        return maxHourglassSum;
    }

    static int calculateHourGlassSum(List<List<Integer>> arr, int i, int j) {
        return arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                arr.get(i+1).get(j+1) +
                arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
    }

}