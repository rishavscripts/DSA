import java.util.Scanner;

public class AndrewAndtheMeatballsAgain {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (k > n / 2) {
                System.out.println(-1);
                continue;
            }

            for (int i = 1; i <= k; i++) {
                System.out.print(2 * i + " ");
            }
            System.out.println();
        }
    }
}
