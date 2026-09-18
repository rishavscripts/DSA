import java.util.*;

public class ValidExpression {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int N = sc.nextInt();
            int X = sc.nextInt();
            
            int target = X - 1;
            boolean found = false;
            
            for (int plus = 0; plus <= N; plus++) {
                int minus = plus - target;
                if (minus >= 0 && plus + minus <= N) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < plus; i++) sb.append('+');
                    for (int i = 0; i < minus; i++) sb.append('-');
                    while (sb.length() < N) sb.append('*');
                    System.out.println(sb);
                    found = true;
                    break;
                }
            }
            
            if (!found) System.out.println(-1);
        }
    }
}
