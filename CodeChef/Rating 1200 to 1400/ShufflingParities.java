import java.util.*;

public class ShufflingParities {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int oddVals = 0, evenVals = 0;

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if ((x & 1) == 1) oddVals++;
                else evenVals++;
            }

            int oddPos = (n + 1) / 2; // 1,3,5,...
            int evenPos = n / 2;      // 2,4,6,...

            int ans = Math.min(oddVals, oddPos) + Math.min(evenVals, evenPos);
            System.out.println(ans);
        }
    }
}