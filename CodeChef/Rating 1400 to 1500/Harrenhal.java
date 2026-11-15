import java.util.Scanner;

public class Harrenhal {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            
            // Check if the string is a palindrome
            boolean isPalindrome = true;
            int n = s.length();
            for (int i = 0; i < n / 2; i++) {
                if (s.charAt(i) != s.charAt(n - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }
            
            // If it's a palindrome, answer is 1. Otherwise, it takes 2 moves.
            if (isPalindrome) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
