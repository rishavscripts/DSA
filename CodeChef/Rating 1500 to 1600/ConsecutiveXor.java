import java.util.Scanner;

public class ConsecutiveXor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int xor = 0;

            for (int i = 0; i < n; i++) {
                xor ^= sc.nextInt();
            }

            if (n % 2 == 1 || xor == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
