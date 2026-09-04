import java.util.*;

public class SwappingChefsWay {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            // Sorted version of the string
            char[] sortedArr = s.toCharArray();
            Arrays.sort(sortedArr);
            String sorted = new String(sortedArr);

            boolean possible = true;
            for (int i = 0; i < n / 2; i++) {
                // Original pair
                char c1 = s.charAt(i);
                char c2 = s.charAt(n - 1 - i);

                // Sorted pair
                char d1 = sorted.charAt(i);
                char d2 = sorted.charAt(n - 1 - i);

                // Compare as multisets (unordered pair)
                if (!samePair(c1, c2, d1, d2)) {
                    possible = false;
                    break;
                }
            }

            System.out.println(possible ? "YES" : "NO");
        }
    }

    // Helper to check if two pairs of characters form the same multiset
    private static boolean samePair(char a, char b, char x, char y) {
        return (a == x && b == y) || (a == y && b == x);
    }
}
