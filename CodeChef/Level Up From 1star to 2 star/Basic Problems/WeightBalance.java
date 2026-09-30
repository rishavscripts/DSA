import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WeightBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            if (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            int w1 = Integer.parseInt(st.nextToken());
            int w2 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int gained = w2 - w1;
            int minGain = x1 * m;
            int maxGain = x2 * m;

            if (gained >= minGain && gained <= maxGain) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }
        System.out.print(sb);
    }
}
