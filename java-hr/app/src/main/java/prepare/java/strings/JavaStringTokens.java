package prepare.java.strings;

import java.util.*;

public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        List<String> stringTokens = getStringTokens(input);

        System.out.println(stringTokens.size());
        for (String word : stringTokens) {
            System.out.println(word);
        }
    }

    static List<String> getStringTokens(String input) {
        String[] arraySplit = input.split("[ !,?._'@]+");
        return getListWithoutEmptyStrings(arraySplit);
    }

    private static List<String> getListWithoutEmptyStrings(String[] input) {
        List<String> result = new LinkedList<>();

        for(String item : input)
            if(!"".equals(item))
                result.add(item);

        return result;
    }
}
