import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int len = str.length();
        char[] stack = new char[len];
        int top = -1;

        for (int i = 0; i < len; i++) {
            stack[++top] = str.charAt(i);
        }

        boolean isPal = true;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != stack[top--]) {
                isPal = false;
                break;
            }
        }

        if (isPal) {
            System.out.println("String is a Palindrome.");
        } else {
            System.out.println("String is NOT a Palindrome.");
        }
    }
}