import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortTheString {
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        
        StringBuilder out = new StringBuilder();
        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine().trim());
            String S = br.readLine().trim();
            
            int operations = 0;
            for (int i = 0; i < N - 1; i++) {
                if (S.charAt(i) == '1' && S.charAt(i + 1) == '0') {
                    operations++;
                }
            }
            out.append(operations).append("\n");
        }
        System.out.print(out);
    }
}
