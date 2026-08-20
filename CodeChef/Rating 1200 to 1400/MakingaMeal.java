import java.util.*;

public class MakingaMeal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            HashMap<Character, Integer> freq = new HashMap<>();

            // Count all letters from all ingredient strings
            for (int i = 0; i < N; i++) {
                String s = sc.next();
                for (char ch : s.toCharArray()) {
                    freq.put(ch, freq.getOrDefault(ch, 0) + 1);
                }
            }

            // Word to form
            String target = "codechef";
            // Required frequency of each character in "codechef"
            HashMap<Character, Integer> need = new HashMap<>();
            for (char ch : target.toCharArray()) {
                need.put(ch, need.getOrDefault(ch, 0) + 1);
            }

            // Calculate maximum meals
            int maxMeals = Integer.MAX_VALUE;
            for (char ch : need.keySet()) {
                int available = freq.getOrDefault(ch, 0);
                int required = need.get(ch);
                maxMeals = Math.min(maxMeals, available / required);
            }

            System.out.println(maxMeals);
        }
    }
}
