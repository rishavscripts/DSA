import java.util.Arrays;
import java.util.Scanner;

public class MagicianversusChef {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            Arrays.fill(arr, 0);

            int x = sc.nextInt();
            arr[x - 1] = 1;   // FIXED: mark correct position

            int s = sc.nextInt();
            for (int i = 0; i < s; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                // also adjust for 1-based input
                int temp = arr[a - 1];
                arr[a - 1] = arr[b - 1];
                arr[b - 1] = temp;
            }

            System.out.println(index(arr, n));
        }
    }

    public static int index(int[] arr, int n) {
        int var = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                var = i + 1;  // return 1-based index
            }
        }
        return var;
    }
}
