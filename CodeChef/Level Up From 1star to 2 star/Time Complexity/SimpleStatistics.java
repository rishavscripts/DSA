import java.util.*;
public class SimpleStatistics {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();

            Arrays.sort(a);
            long sum = 0;
            for (int i = k; i < n - k; i++) {
                sum += a[i];
            }

            double avg = (double) sum / (n - 2 * k);
            System.out.printf("%.6f\n", avg);
        }
    }
}
