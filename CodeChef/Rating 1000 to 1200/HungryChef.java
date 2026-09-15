import java.util.Scanner;

public class HungryChef {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long x = sc.nextLong();
                long y = sc.nextLong();
                long n = sc.nextLong();
                long r = sc.nextLong();

                // If even N normal burgers cost more than R, it's impossible
                if (n * x > r) {
                    System.out.println("-1");
                } else {
                    // Calculate maximum premium burgers we can buy
                    long premium = (r - n * x) / (y - x);
                    
                    // We cannot buy more premium burgers than total burgers N
                    premium = Math.min(premium, n);
                    
                    long normal = n - premium;
                    
                    System.out.println(normal + " " + premium);
                }
            }
        }
        sc.close();
    }
}
