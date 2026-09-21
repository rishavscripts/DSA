import java.util.Arrays;
import java.util.Scanner;

public class UpsAndDowns {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception {
        int t = sc.nextInt();
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Sort the array
            Arrays.sort(a);
            
            // Swap adjacent elements starting from index 1
            // This ensures: A[0] <= A[1] >= A[2] <= A[3] ...
            for (int i = 1; i < n - 1; i += 2) {
                int temp = a[i];
                a[i] = a[i + 1];
                a[i + 1] = temp;
            }
            
            for (int i = 0; i < n; i++) {
                out.append(a[i]).append(" ");
            }
            out.append("\n");
        }
        
        System.out.print(out);
    }
}
