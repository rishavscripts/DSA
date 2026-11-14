import java.util.Scanner;

public class AntiPalindrome {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int C = sc.nextInt();
		
		while (C-- > 0) {
		    int N = sc.nextInt();
		    String S = sc.next();
		    
		    // Count frequencies of each character
            int[] freq = new int[26];
            for (int i = 0; i < N; i++) {
                freq[S.charAt(i) - 'a']++;
            }
            
            // Count how many characters have an odd frequency and total distinct characters
            int odds = 0;
            int distinctChars = 0;
            for (int i = 0; i < 26; i++) {
                if (freq[i] > 0) {
                    distinctChars++;
                    if (freq[i] % 2 != 0) {
                        odds++;
                    }
                }
            }
            
            // Check if S is already an anti-palindrome (i.e., not a semi-palindrome)
            boolean isSemiPalindrome = false;
            if (N % 2 == 0) {
                if (odds == 0) {
                    isSemiPalindrome = true;
                }
            } else {
                if (odds == 1) {
                    isSemiPalindrome = true;
                }
            }
            
            // Determine the minimum operations needed
            if (!isSemiPalindrome) {
                System.out.println(0);
            } else {
                if (N % 2 == 0) {
                    System.out.println(1);
                } else {
                    if (distinctChars == 1) {
                        System.out.println(2);
                    } else {
                        System.out.println(1);
                    }
                }
            }
		}
	}
}
