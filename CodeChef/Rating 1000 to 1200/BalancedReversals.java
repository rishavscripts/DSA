import java.util.Scanner;

public class BalancedReversals {
     public static void main (String[] args) throws java.lang.Exception
    {
        Scanner scanner = new Scanner(System.in);
        
        
        int t = scanner.nextInt();
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            String s = scanner.next();
            
            int zeros = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                }
            }
            int ones = n - zeros;
            
            // Append all zeros followed by all ones to get the lexicographically smallest string
            for (int i = 0; i < zeros; i++) {
                out.append('0');
            }
            for (int i = 0; i < ones; i++) {
                out.append('1');
            }
            out.append("\n");
        }
        
        System.out.print(out);
        scanner.close();
    }
}
