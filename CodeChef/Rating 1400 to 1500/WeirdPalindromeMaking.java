import java.util.Scanner;

public class WeirdPalindromeMaking {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int oddCount = 0;
            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                // Count how many numbers are odd
                if (a % 2 != 0) {
                    oddCount++;
                }
            }
            out.append(oddCount / 2).append("\n");
        }
        System.out.print(out);
    }
}
