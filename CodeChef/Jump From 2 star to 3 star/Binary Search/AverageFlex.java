import java.util.*;
public class AverageFlex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int ans = 0;
            int i = 0;

            while (i < n) {

                int j = i;

                while (j < n && a[j] == a[i]) {
                    j++;
                }

                int le = j; // number of elements <= current value

                if (2 * le > n) {
                    ans += (j - i);
                }

                i = j;
            }

            System.out.println(ans);
        }
    }
}
