import java.util.Stack;
import java.util.Scanner;

public class parentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string with parentheses:");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

    public static boolean isBalanced(String str) {
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if (!isMatchingPair(top, c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
//1.3.4

