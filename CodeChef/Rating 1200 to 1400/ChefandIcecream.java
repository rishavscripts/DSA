import java.util.*;
// test
public class ChefandIcecream {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count5 = 0, count10 = 0;
            boolean ok = true;

            for (int i = 0; i < n; i++) {
                int cost = sc.nextInt();
                if (cost == 5) {
                    count5++;
                } else if (cost == 10) {
                    if (count5 > 0) {
                        count5--;
                        count10++;
                    } else {
                        ok = false;
                    }
                } else { // cost == 15
                    if (count10 > 0) {
                        count10--;
                    } else if (count5 >= 2) {
                        count5 -= 2;
                    } else {
                        ok = false;
                    }
                }
            }
            System.out.println(ok ? "YES" : "NO");
        }
    }
}
