import java.util.*;
public class ChefDrinksCoke {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int k=sc.nextInt();
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int c = sc.nextInt();
                int p = sc.nextInt();
                int finalTemp;

                if (c > k + 1) {
                    finalTemp = Math.max(c - m, k);
                } else if (c < k - 1) {
                    finalTemp = Math.min(c + m, k);
                } else {
                    finalTemp = k;
                }

                if (finalTemp >= l && finalTemp <= r) {
                    ans = Math.min(ans, p);
                }
            }

            System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
        }
    }
}
