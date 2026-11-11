import java.util.Scanner;

public class ParenthesesChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expr = sc.nextLine();

        char[] st = new char[expr.length()];
        int top = -1;
        boolean balanced = true;

        for (int i = 0; i < expr.length(); i++) {
            char ch = expr.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st[++top] = ch;
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (top == -1) {
                    balanced = false;
                    break;
                }
                char popped = st[top--];
                if ((ch == ')' && popped != '(') ||
                    (ch == '}' && popped != '{') ||
                    (ch == ']' && popped != '[')) {
                    balanced = false;
                    break;
                }
            }
        }

        if (top != -1) {
            balanced = false;
        }

        if (balanced) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are NOT balanced.");
        }
    }
}