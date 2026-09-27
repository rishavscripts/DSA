import java.util.*;
public class HiringTest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
          //  int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < n; i++) {
                String s = sc.next();
                int full = 0, partial = 0;
                for (char c : s.toCharArray()) {
                    if (c == 'F') full++;
                    else if (c == 'P') partial++;
                }
                
                if (full >= x || (full >= x - 1 && partial >= y)) {
                    result.append("1");
                } else {
                    result.append("0");
                }
            }
            
            System.out.println(result.toString());
        }
    }
}
