
import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

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
        long startTime, endTime;

        boolean result = strategy.check(input);
        startTime = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        endTime = System.nanoTime();
        long time1 = endTime - startTime;

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
        startTime = System.nanoTime();
        boolean result2 = stackCheck(input);
        endTime = System.nanoTime();
        long time2 = endTime - startTime;

        sc.close();
    }
        startTime = System.nanoTime();
        boolean result3 = recursiveCheck(input, 0, input.length() - 1);
        endTime = System.nanoTime();
        long time3 = endTime - startTime;

    interface PalindromeStrategy {
        boolean check(String input);
    }
        System.out.println("\nInput : " + input);

    static class StackStrategy implements PalindromeStrategy {
        System.out.println("\nTwo Pointer Result : " + result1);
        System.out.println("Execution Time (ns) : " + time1);

        public boolean check(String input) {
        System.out.println("\nStack Result : " + result2);
        System.out.println("Execution Time (ns) : " + time2);

            char[] stack = new char[input.length()];
            int top = -1;
        System.out.println("\nRecursive Result : " + result3);
        System.out.println("Execution Time (ns) : " + time3);

            for (int i = 0; i < input.length(); i++) {
                stack[++top] = input.charAt(i);
            }
        sc.close();
    }

            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != stack[top--]) {
                    return false;
                }
            }
    static boolean twoPointerCheck(String input) {

            return true;
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    static class DequeStrategy implements PalindromeStrategy {
    static boolean stackCheck(String input) {

        public boolean check(String input) {
        char[] stack = new char[input.length()];
        int top = -1;

            char[] deque = new char[input.length()];
            int front = 0;
            int rear = -1;
        for (int i = 0; i < input.length(); i++) {
            stack[++top] = input.charAt(i);
        }

            for (int i = 0; i < input.length(); i++) {
                deque[++rear] = input.charAt(i);
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack[top--]) {
                return false;
            }
        }

            while (front < rear) {
                if (deque[front] != deque[rear]) {
                    return false;
                }
                front++;
                rear--;
            }
        return true;
    }

    static boolean recursiveCheck(String input, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (input.charAt(start) != input.charAt(end)) {
            return false;
        }

        return recursiveCheck(input, start + 1, end - 1);
    }
}
