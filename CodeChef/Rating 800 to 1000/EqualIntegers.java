import java.util.*;
public class EqualIntegers {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception{
        int t=sc.nextInt();
        while(t-->0){
            int X=sc.nextInt();
            int Y=sc.nextInt();
            int ans = Integer.MAX_VALUE;
            int start = Math.max(X, Y);

            for (int T = start; T <= start + 1; T++) {
                if ((T - Y) % 2 == 0) {
                    int cost = (T - X) + (T - Y) / 2;
                    ans = Math.min(ans, cost);
                }
            }
            System.out.println(ans);
        }
    }
}
