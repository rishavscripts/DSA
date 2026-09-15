import java.util.*;
public class LockpickingChef {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            String s=sc.next();
            String k=sc.next();
            int ans = Integer.MAX_VALUE;

            for (int i = 0; i <= n - m; i++) {
                int moves = 0;
                for (int j = 0; j < m; j++) {
                    int sd = s.charAt(i + j) - '0';
                    int kd = k.charAt(j) - '0';
                    int diff = Math.abs(sd - kd);
                    moves += Math.min(diff, 10 - diff);
                }
                ans = Math.min(ans, moves);
            }

            System.out.println(ans);
        }
    }
}
