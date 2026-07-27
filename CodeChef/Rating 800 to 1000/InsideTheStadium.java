import java.util.*;
public class InsideTheStadium {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int count = 0;
            int totalRuns = 0;

            for (int i = 1; i <= n; i++) {
                int runs = sc.nextInt();
                totalRuns += runs;

                if (totalRuns == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
