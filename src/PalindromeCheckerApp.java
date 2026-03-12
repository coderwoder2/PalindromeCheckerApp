import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);
        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        PalindromeStrategy strategy;

        if (choice == 1) {
            strategy = new StackStrategy();
        } else {
            strategy = new DequeStrategy();
        }

        boolean result = strategy.check(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);

        sc.close();
    }

    static class PalindromeChecker {
    interface PalindromeStrategy {
        boolean check(String input);
    }

    static class StackStrategy implements PalindromeStrategy {

        public boolean check(String input) {

            char[] stack = new char[input.length()];
            int top = -1;

            for (int i = 0; i < input.length(); i++) {
                stack[++top] = input.charAt(i);
            }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack[top--]) {
                    return false;
                }
            }

            return true;
        }
    }

    static class DequeStrategy implements PalindromeStrategy {

        public boolean checkPalindrome(String input) {
        public boolean check(String input) {

            String normalized = input.replaceAll("\\s+", "").toLowerCase();
            char[] deque = new char[input.length()];
            int front = 0;
            int rear = -1;

            int start = 0;
            int end = normalized.length() - 1;
            for (int i = 0; i < input.length(); i++) {
                deque[++rear] = input.charAt(i);
            }

            while (start < end) {
                if (normalized.charAt(start) != normalized.charAt(end)) {
            while (front < rear) {
                if (deque[front] != deque[rear]) {
                    return false;
                }
                start++;
                end--;
                front++;
                rear--;
            }

            return true;
        }
    }
}
