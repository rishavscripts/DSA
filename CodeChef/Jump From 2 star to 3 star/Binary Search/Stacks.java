import java.util.*;
public class Stacks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            TreeMap<Long, Integer> tops = new TreeMap<>();

            for (int i = 0; i < n; i++) {

                long x = sc.nextLong();

                Long key = tops.higherKey(x);

                if (key != null) {

                    int cnt = tops.get(key);

                    if (cnt == 1) {
                        tops.remove(key);
                    } else {
                        tops.put(key, cnt - 1);
                    }
                }

                tops.put(x, tops.getOrDefault(x, 0) + 1);
            }

            int stacks = 0;
            for (int cnt : tops.values()) {
                stacks += cnt;
            }

            StringBuilder sb = new StringBuilder();
            sb.append(stacks);

            for (Map.Entry<Long, Integer> entry : tops.entrySet()) {

                long top = entry.getKey();
                int cnt = entry.getValue();

                while (cnt-- > 0) {
                    sb.append(" ").append(top);
                }
            }

            System.out.println(sb);
        }
    }
}
