import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = sc.nextLine();

        char[] chars = input.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        int start = 0;
        int end = chars.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (chars[start] != chars[end]) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);
