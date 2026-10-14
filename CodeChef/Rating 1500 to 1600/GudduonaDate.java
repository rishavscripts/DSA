import java.util.*;
public class GudduonaDate {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long N = sc.nextLong();
            long sum = digitSum(N);
            long d = (10 - (sum % 10)) % 10;
            long ans = N * 10 + d;
            System.out.println(ans);
        }
    }
    static long digitSum(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
