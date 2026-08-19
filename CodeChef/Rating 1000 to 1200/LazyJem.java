import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LazyJem {
    public static void main (String[] args) throws java.io.IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int t = Integer.parseInt(st.nextToken());
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            
            long totalTime = 0;
            
            while (n > 0) {
                long problemsToSolve = (n + 1) / 2;
                totalTime += problemsToSolve * m;
                n -= problemsToSolve;
                
                // If there are still problems remaining, he takes a break 
                // and then his solving time doubles.
                if (n > 0) {
                    totalTime += b;
                    m *= 2;
                }
            }
            
            sb.append(totalTime).append("\n");
        }
        
        System.out.print(sb);
    }
}
