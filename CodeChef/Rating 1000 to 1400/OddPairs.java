import java.util.Scanner;

public class OddPairs {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long evens = n / 2;          // floor(n/2)
            long odds = (n + 1) / 2;     // ceil(n/2)
            long pairs = 2 * evens * odds;
            System.out.println(pairs);
        }
        sc.close();
    }
}
