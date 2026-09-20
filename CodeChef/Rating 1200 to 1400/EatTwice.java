import java.util.*;
public class EatTwice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
           // int m=sc.nextInt();
            Map<Integer, Integer> dayMax = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int d = sc.nextInt();
                int v = sc.nextInt();
                dayMax.put(d, Math.max(dayMax.getOrDefault(d, 0), v));
            }
            List<Integer> values = new ArrayList<>(dayMax.values());
            values.sort(Collections.reverseOrder());
            int ans = values.get(0) + values.get(1);
            System.out.println(ans);
        }
    }
}
