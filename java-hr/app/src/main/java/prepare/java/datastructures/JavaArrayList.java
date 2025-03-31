package prepare.java.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int numberOfLines = Integer.parseInt(bufferedReader.readLine());

        ArrayList<List<Integer>> allLines = new ArrayList<>();

        for (int i=0; i<numberOfLines; i++) {
            List<Integer> line = Arrays.asList(Arrays.stream(bufferedReader.readLine()
                    .split(" "))
                    .mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new));

            allLines.add(line);
        }

        int numberOfQueries = Integer.parseInt(bufferedReader.readLine());

        for (int j=0; j<numberOfQueries; j++) {
            int[] temp = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int x = temp[0];
            int y = temp[1];

            Integer valueInPosition = findValueInPosition(allLines, x, y);

            if (valueInPosition == null) {
                System.out.println("ERROR!");
            } else {
                System.out.println(valueInPosition);
            }
        }
    }

    static Integer findValueInPosition(ArrayList<List<Integer>> allLines, int x, int y) {
        int quantityInLine = allLines.get(x-1).getFirst();

        if (y > quantityInLine)
            return null;

        return allLines.get(x-1).get(y);
    }
}
