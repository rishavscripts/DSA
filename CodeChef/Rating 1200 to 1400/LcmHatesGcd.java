import java.util.*;
public class LcmHatesGcd {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long a=sc.nextLong();
            long b=sc.nextLong();
            long ans=Math.min(a-1,Math.min(a-gcd(a,b),lcm(a,b)-b));
            System.out.println(ans);

        }
    }
    static long gcd(long x, long y) {
        return y == 0 ? x : gcd(y, x % y);
    }

    static long lcm(long x, long y) {
        return (x / gcd(x, y)) * y;
    }
}
