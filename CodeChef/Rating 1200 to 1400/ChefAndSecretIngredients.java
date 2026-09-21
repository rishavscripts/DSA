import java.util.*;
public class ChefAndSecretIngredients {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] freq = new int[26]; // track across dishes
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                boolean[] seen = new boolean[26];
                for (char c : s.toCharArray()) {
                    seen[c - 'a'] = true;
                }
                for (int j = 0; j < 26; j++) {
                    if (seen[j]) freq[j]++;
                }
            }
            int count = 0;
            for (int j = 0; j < 26; j++) {
                if (freq[j] == n) count++;
            }
            System.out.println(count);
        }
    }
}
