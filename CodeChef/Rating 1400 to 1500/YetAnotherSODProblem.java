import java.util.Scanner;

public class YetAnotherSODProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long L = sc.nextLong();
                long R = sc.nextLong();
                
                // Count of numbers divisible by 3 in range [1, R] minus [1, L-1]
                long count = (R / 3) - ((L - 1) / 3);
                
                System.out.println(count);
            }
        }
        
    }
}
