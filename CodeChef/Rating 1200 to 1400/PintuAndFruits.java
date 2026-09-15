import java.util.*;
public class PintuAndFruits {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] type = new int[n];
            for(int i=0;i<n;i++){type[i]=sc.nextInt();}
            int[] price= new int[n];
            for(int i=0;i<n;i++){price[i]=sc.nextInt();}

            int[] cost = new int[m + 1]; // sum per fruit type
            for (int i = 0; i < n; i++) {
                cost[type[i]] += price[i];
            }

            int ans = Integer.MAX_VALUE;
            for (int i = 1; i <= m; i++) {
                if (cost[i] > 0) ans = Math.min(ans, cost[i]);
            }

            System.out.println(ans);
        }
    }    
}
