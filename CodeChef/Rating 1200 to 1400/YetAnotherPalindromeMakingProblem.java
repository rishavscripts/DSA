import java.util.*;

public class YetAnotherPalindromeMakingProblem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (char c : s.toCharArray()) {
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            int oddCount = 0;
            for (int freq : map.values()) {
                if (freq % 2 != 0) oddCount++;
            }

            if ((n % 2 == 0 && oddCount == 0) || (n % 2 == 1 && oddCount == 1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
