import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        int n = input.length();

        Stack<Character> stack = new Stack<>();

        char[] queue = new char[n];
        char[] deque = new char[input.length()];
        int front = 0;
        int rear = 0;
        int rear = -1;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue[rear++] = ch;
        for (char c : input.toCharArray()) {
            deque[++rear] = c;
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue[front++];

            if (fromStack != fromQueue) {
        while (front < rear) {
            if (deque[front] != deque[rear]) {
                isPalindrome = false;
                break;
            }
            front++;
            rear--;
        }

        System.out.println("Input : " + input);
