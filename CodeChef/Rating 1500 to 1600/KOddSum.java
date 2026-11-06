import java.util.Scanner;

public class KOddSum {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            for (int i = k + 1; i >= 1; i--) {
                sb.append(i).append(" ");
            }

            for (int i = k + 2; i <= n; i++) {
                sb.append(i).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
