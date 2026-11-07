import java.util.Scanner;

public class MagicSet {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                // Count how many elements are divisible by m
                if (a % m == 0) {
                    count++;
                }
            }
            
            // The number of good subsequences is 2^count - 1
            long ans = (1L << count) - 1;
            System.out.println(ans);
        }
    }
}
