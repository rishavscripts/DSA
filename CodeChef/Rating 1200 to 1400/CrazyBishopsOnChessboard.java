import java.util.*;
public class CrazyBishopsOnChessboard {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long ans;
            if (n <= 2) {
                ans = 0;
            } else if (n % 2 == 0) {
                ans = 3L * (n - 2) / 2;
            } else {
                ans = n - 1;
            }

            System.out.println(ans);
        }
    }
}
