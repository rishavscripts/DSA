import java.util.Scanner;

public class AlternatingWorkDays {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long p = sc.nextLong();
                long q = sc.nextLong();
                
                // Check if P is a multiple of A, Q is a multiple of B,
                // and the difference in their working days is at most 1.
                if (p % a == 0 && q % b == 0 && Math.abs((p / a) - (q / b)) <= 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
