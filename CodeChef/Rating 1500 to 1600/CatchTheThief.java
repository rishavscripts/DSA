import java.util.Scanner;

public class CatchTheThief {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        

        int T = sc.nextInt();

        while (T-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long k = sc.nextLong();
            long n = sc.nextLong();

            if ((Math.abs(x - y) % k) != 0) {
                System.out.println("No");
            } else if (n == k) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
