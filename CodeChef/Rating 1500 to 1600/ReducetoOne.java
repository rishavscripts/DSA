import java.util.*;
public class ReducetoOne {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
           long MOD = 1000000007L;
           int n=sc.nextInt();
           long result = 1;
            for (int i = 2; i <= n+1; i++) {
                result = (result * i) % MOD;
            }
            result = (result - 1 + MOD) % MOD; // ensure non-negative
            System.out.println(result);           
        }
    }
}
