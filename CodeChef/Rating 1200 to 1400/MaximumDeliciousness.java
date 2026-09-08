import java.util.*;

public class MaximumDeliciousness {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int l = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            Arrays.sort(arr); // ascending
            // reverse to descending
            for (int i = 0; i < n / 2; i++) {
                int temp = arr[i];
                arr[i] = arr[n - 1 - i];
                arr[n - 1 - i] = temp;
            }

            long sum = 0;
            for (int i = l - 1; i < n; i += k) {
                sum += arr[i];
            }
            System.out.println(sum);
        }
    }
}
