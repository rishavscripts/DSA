import java.util.*;
public class MinimumDistanceBetween1s {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            List<Integer> ones = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') ones.add(i);
            }

            boolean hasEven = false, hasOdd = false;
            for (int pos : ones) {
                if (pos % 2 == 0) hasEven = true;
                else hasOdd = true;
            }

            if (hasEven && hasOdd) {
                System.out.println(1);
            } else {
                System.out.println(2);
            }
        }
    }
}
