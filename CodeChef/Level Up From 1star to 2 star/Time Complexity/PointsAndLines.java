import java.util.*;
public class PointsAndLines {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            Set<Integer> xSet = new HashSet<>();
            Set<Integer> ySet = new HashSet<>();
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                xSet.add(x);
                ySet.add(y);
            }
            System.out.println(xSet.size() + ySet.size());
        }
    }
}
