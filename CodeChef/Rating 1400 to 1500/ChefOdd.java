import java.util.Scanner;

public class ChefOdd {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            if (n < 2 * k) {
                System.out.println("NO");
            } else {
                long oddCount = (n + 1) / 2;
                if ((oddCount - k) % 2 == 0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
