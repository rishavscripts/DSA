import java.util.Arrays;
import java.util.Scanner;

public class MaximizeColours {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            
            // Sort the array to easily pick the largest amounts first
            Arrays.sort(a);
            
            int ans = 0;
            
            // 1. Keep at least 1 drop of each available primary color
            for (int i = 0; i < 3; i++) {
                if (a[i] > 0) {
                    ans++;
                    a[i]--;
                }
            }
            
            // 2. Pair up the remaining drops to form secondary colors
            for (int i = 2; i >= 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (a[i] > 0 && a[j] > 0) {
                        ans++;
                        a[i]--;
                        a[j]--;
                    }
                }
            }
            
            System.out.println(ans);
        }
    }
}
