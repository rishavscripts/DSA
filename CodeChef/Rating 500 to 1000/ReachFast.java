import java.util.*;
public class ReachFast {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            int diff = Math.abs(a - b);

            if (diff == 0) {
                System.out.println(0);
            } else if (diff % k == 0) {
                System.out.println(diff / k);
            } else {
                System.out.println(diff / k + 1);
            }
        }
    }
}
