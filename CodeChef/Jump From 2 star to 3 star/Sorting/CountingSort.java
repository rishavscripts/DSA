import java.util.*;
public class CountingSort {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] count = new int[101];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                count[x]++;
            }

            StringBuilder sb = new StringBuilder();

            for (int num = 1; num <= 100; num++) {
                while (count[num]-- > 0) {
                    sb.append(num).append(" ");
                }
            }

            System.out.println(sb.toString().trim());
        }
    }
}
