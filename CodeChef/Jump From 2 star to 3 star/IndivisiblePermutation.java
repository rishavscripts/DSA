import java.util.Scanner;

public class IndivisiblePermutation {
     static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        // Check if there are test cases to read
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            
            while (t-- > 0) {
                int n = sc.nextInt();
                
                // Print N first, followed by numbers from 1 to N-1
                System.out.print(n + " ");
                for (int i = 1; i < n; i++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
