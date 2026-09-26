import java.util.*;

public class CollegeLife2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            int[] q = new int[s];
            for (int i = 0; i < s; i++) {
                q[i] = sc.nextInt();
            }
            
            long total = 0;
            for (int i = 0; i < s; i++) {
                int e = sc.nextInt();
                int[] episodes = new int[e];
                for (int j = 0; j < e; j++) {
                    episodes[j] = sc.nextInt();
                }
                
                // First episode watched fully
                total += episodes[0];
                
                // Remaining episodes with intro skipped
                for (int j = 1; j < e; j++) {
                    total += episodes[j] - q[i];
                }
            }
            System.out.println(total);
        }
    }
}
