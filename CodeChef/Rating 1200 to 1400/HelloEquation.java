import java.util.Scanner;

public class HelloEquation {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            long y = x + 4;
            boolean ok = false;
            for (long p = 3; p * p <= y; p++) {
                if (y % p == 0) {
                    long q = y / p;
                    if (q >= 3) {
                        ok = true;
                        break;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
