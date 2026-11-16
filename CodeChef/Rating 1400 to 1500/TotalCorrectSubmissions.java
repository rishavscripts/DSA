import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class TotalCorrectSubmissions {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        // Check if there is any input available
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            // Map to store the total solutions for each problem code
            Map<String, Long> counts = new HashMap<>();
            
            // There are 3 divisions, each having N problems (total 3 * N entries)
            for (int i = 0; i < 3 * n; i++) {
                String code = sc.next();
                long c = sc.nextLong();
                counts.put(code, counts.getOrDefault(code, 0L) + c);
            }
            
            // Extract the totals and sort them in non-decreasing order
            List<Long> result = new ArrayList<>(counts.values());
            Collections.sort(result);
            
            // Append the result to StringBuilder
            for (int i = 0; i < result.size(); i++) {
                sb.append(result.get(i)).append(i == result.size() - 1 ? "" : " ");
            }
            sb.append("\n");
        }
        
        // Print all outputs at once
        System.out.print(sb);
    }
}
