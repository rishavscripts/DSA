import java.util.Scanner;

public class PermutationXority {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Corner case: N = 2
            if (n == 2) {
                System.out.println("-1");
                continue;
            }
            
            // If N is odd
            if (n % 2 == 1) {
                for (int i = 1; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            } 
            // If N is even (and > 2)
            else {
                System.out.print("2 3 1 ");
                for (int i = 4; i <= n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
