import java.util.*;
public class SortChecker {
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);

            boolean same = true;

            for (int i = 0; i < n; i++) {
                if (a[i] != b[i]) {
                    same = false;
                    break;
                }
            }

            System.out.println(same ? "yes" : "no");
        }
    }
}
