package prepare.java.datastructures;

import java.util.*;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        ArrayList<Integer> inputList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            inputList.add(num);
        }

        in.close();

        int maxUniqueIntegers = getMaxUniqueIntegers(n, m, inputList);

        System.out.println(maxUniqueIntegers);
    }

    static int getMaxUniqueIntegers(int n, int m, ArrayList<Integer> inputList) {
        int maxUniqueIntegers = 0;
        int currentUniqueIntegers = 0;
        HashSet<Integer> set = new HashSet<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int num = inputList.get(i);

            deque.offerLast(num);
            set.add(num);

            if (deque.size() == m) {
                currentUniqueIntegers = set.size();
                maxUniqueIntegers = Math.max(maxUniqueIntegers, currentUniqueIntegers);

                Integer first = deque.removeFirst();

                if (!deque.contains(first)) {
                    set.remove(first);
                }
            }

            if (maxUniqueIntegers == m) {
                break;
            }
        }

        return maxUniqueIntegers;
    }
}
