package prepare.java.datastructures;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class JavaList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine());

        ArrayList<Integer> L = new java.util.ArrayList<>(List.of(
                Arrays.stream(bufferedReader.readLine().split(" "))
                        .map(Integer::parseInt)
                        .toArray(Integer[]::new)));

        int Q = Integer.parseInt(bufferedReader.readLine());

        for (int i=0; i<Q; i++) {
            String action = bufferedReader.readLine();

            if (Objects.equals(action, "Insert")) {
                String[] query = bufferedReader.readLine().split(" ");
                int index = Integer.parseInt(query[0]);
                int value = Integer.parseInt(query[1]);

                executeQuery(L, index, value);
            }
            if (Objects.equals(action, "Delete")) {
                int index = Integer.parseInt(bufferedReader.readLine());

                executeQuery(L, index, null);
            }

        }

        StringBuilder listToString = new StringBuilder();

        for (int i=0; i<L.size(); i++) {
            listToString.append(L.get(i));
            if (i!= L.size()-1) {
                listToString.append(" ");
            }
        }

        System.out.println(listToString);

        bufferedReader.close();
    }

    private static void executeQuery(ArrayList<Integer> list, int index, Integer value) {
        if (value == null) {
            list.remove(index);
        } else {
            list.add(index, value);
        }
    }
}
