import java.util.Scanner;

public class Divisiblebyi {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            
            int l = 1, r = n;
            // Fill the array from right to left using the correct logic
            for (int i = n - 1; i >= 0; i--) {
                if (i % 2 == (n - 1) % 2) {
                    p[i] = r--;
                } else {
                    p[i] = l++;
                }
            }
            
            // Print the result for the current test case
            for (int i = 0; i < n; i++) {
                System.out.print(p[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}
