import java.util.*;

public class ClosestVowels {
    static final int MOD = 1000000007;
    static Scanner sc = new Scanner(System.in);

    // Precompute closest vowel counts for each character
    static int[] closestChoices = new int[26];

    static {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        Set<Character> vowelSet = new HashSet<>();
        for (char v : vowels) vowelSet.add(v);

        for (char c = 'a'; c <= 'z'; c++) {
            if (vowelSet.contains(c)) {
                closestChoices[c - 'a'] = 1; // vowel itself
            } else {
                int minDist = Integer.MAX_VALUE;
                List<Character> closest = new ArrayList<>();
                for (char v : vowels) {
                    int dist = Math.abs(c - v);
                    if (dist < minDist) {
                        minDist = dist;
                        closest.clear();
                        closest.add(v);
                    } else if (dist == minDist) {
                        closest.add(v);
                    }
                }
                closestChoices[c - 'a'] = closest.size(); // 1 or 2
            }
        }
    }

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            long result = 1;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                result = (result * closestChoices[c - 'a']) % MOD;
            }
            System.out.println(result);
        }
    }
}
