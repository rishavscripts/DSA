import java.util.*;

public class XxOoRr {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            long ans = 0;

            for (int bit = 0; bit < 31; bit++) {
                int count = 0;

                // Read numbers only once
                if (bit == 0) {
                    int[] arr = new int[n];

                    for (int i = 0; i < n; i++) {
                        arr[i] = sc.nextInt();
                    }

                    for (int b = 0; b < 31; b++) {
                        count = 0;

                        for (int num : arr) {
                            if (((num >> b) & 1) == 1) {
                                count++;
                            }
                        }

                        ans += (count + k - 1) / k;
                    }
                    break;
                }
            }

            System.out.println(ans);
        }
    }
}