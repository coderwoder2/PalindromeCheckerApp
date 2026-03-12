import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        int n = input.length();

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        char[] queue = new char[n];
        int front = 0;
        int rear = 0;

        for (int i = 0; i < n; i++) {
            char ch = input.charAt(i);
            stack.push(ch);
            queue[rear++] = ch;
        }

        boolean isPalindrome = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
        while (!stack.isEmpty()) {
            char fromStack = stack.pop();
            char fromQueue = queue[front++];

            if (fromStack != fromQueue) {
                isPalindrome = false;
                break;
            }
