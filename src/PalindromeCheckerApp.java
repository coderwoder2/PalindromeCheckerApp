import java.util.Scanner;

public class PalindromeCheckerApp{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the palindrome checker management system");
        System.out.println("Version : 1.0");
        System.out.println("System intialized successfully.");
        System.out.println();
        System.out.print("input text: ");
        String word = input.nextLine();

       String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }


        if (word.equals(reversed)) {
            System.out.println("is it a palindrome? true");
        } else {
            System.out.println("is it a palindrome? false");
        }
    }
}


