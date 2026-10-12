import java.util.*;
public class FitToPlay {
     static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws java.lang.Exception
    {
        // Check if there is any input to read
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        StringBuilder output = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] g = new int[n];
            
            for (int i = 0; i < n; i++) {
                g[i] = sc.nextInt();
            }
            
            int maxDiff = -1;
            int minm = g[0]; // Minimum goals scored so far
            
            for (int i = 1; i < n; i++) {
                int diff = g[i] - minm;
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
                if (g[i] < minm) {
                    minm = g[i];
                }
            }
            
            if (maxDiff > 0) {
                output.append(maxDiff).append("\n");
            } else {
                output.append("UNFIT\n");
            }
        }
        
        // Print all outputs at once
        System.out.print(output);
    }
}
