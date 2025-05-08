package prepare.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println(isBalanced(input));
        }

        scanner.close();
    }

    static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<input.length(); i++) {
            Character current = input.charAt(i);

            if (current.equals('{') || current.equals('[') || current.equals('(')) {
                stack.push(current);
            } else {
                if (!stack.empty() && closeBracketMatchesOpenBracket(stack.peek(), current)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    private static boolean closeBracketMatchesOpenBracket(Character peek, Character current) {
        return (peek.equals('{') && current.equals('}')) ||
                (peek.equals('[') && current.equals(']')) ||
                (peek.equals('(') && current.equals(')'));
    }
}
