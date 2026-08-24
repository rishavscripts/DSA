import java.util.Scanner;

public class MathisonandPangrams {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            long[] cost = new long[26];
            for (int i = 0; i < 26; i++) {
                cost[i] = sc.nextLong();
            }
            
            String s = sc.next();
            boolean[] present = new boolean[26];
            
            // Mark the characters that are present in the string
            for (int i = 0; i < s.length(); i++) {
                present[s.charAt(i) - 'a'] = true;
            }
            
            // Calculate the total cost of missing characters
            long totalCost = 0;
            for (int i = 0; i < 26; i++) {
                if (!present[i]) {
                    totalCost += cost[i];
                }
            }
            
            System.out.println(totalCost);
        }
    }
}
