import java.util.Scanner;

public class ExactlyNPlus1Values {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                
                // The pattern is: 1, 1, 2, 4, 8, ..., 2^(n-1)
                // First print two 1s
                System.out.print("1 1 ");
                
                // Then print powers of 2 from 2^1 to 2^(n-1)
                // Using 1L << i to prevent overflow for large values of N (up to 60)
                for (int i = 1; i < n; i++) {
                    System.out.print((1L << i) + " ");
                }
                
                System.out.println();
            }
        }
    }
}
