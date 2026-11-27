import java.util.Scanner;

public class VersionControlSystem {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            boolean[] ignored = new boolean[n + 1];
            boolean[] tracked = new boolean[n + 1];

            for (int i = 0; i < m; i++) {
                ignored[sc.nextInt()] = true;
            }

            for (int i = 0; i < k; i++) {
                tracked[sc.nextInt()] = true;
            }

            int both = 0;
            int neither = 0;

            for (int i = 1; i <= n; i++) {

                if (ignored[i] && tracked[i]) {
                    both++;
                }

                if (!ignored[i] && !tracked[i]) {
                    neither++;
                }
            }

            System.out.println(both + " " + neither);
        }
    }
}
