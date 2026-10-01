import java.util.*;
public class GiftShopAndCoupon {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            Arrays.sort(a);
            int maxItems = 0;

            // Try applying coupon to each item
            for (int i = 0; i < n; i++) {
                int[] b = a.clone();
                b[i] = (b[i] + 1) / 2; // ceil(x/2)
                Arrays.sort(b);

                int sum = 0, count = 0;
                for (int cost : b) {
                    if (sum + cost <= k) {
                        sum += cost;
                        count++;
                    } else break;
                }
                maxItems = Math.max(maxItems, count);
            }

            System.out.println(maxItems);
        }
    }
}
