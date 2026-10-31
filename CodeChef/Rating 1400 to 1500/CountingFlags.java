import java.util.Scanner;

public class CountingFlags {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long ans = 0;
            
            // Flag 1 and Flag 2: require at least 2 colors
            if (n >= 2) {
                ans += 2 * n * (n - 1) * (n - 1);
            }
            
            // Flag 3: requires at least 3 colors
            if (n >= 3) {
                ans += n * (n - 1) * (n - 2);
            }
            
            // Flag 4 and Flag 5: require at least 3 colors
            if (n >= 3) {
                ans += 2 * n * (n - 1) * (n - 2) * (n - 2);
            }
            
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}
