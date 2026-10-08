import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bellaciao {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;

        // A helper function to read the next token efficiently
        // (You can also use a custom FastReader class like in the editorial)
        String line = br.readLine();
        if (line == null) return;
        int t = Integer.parseInt(line.trim());

        StringBuilder out = new StringBuilder();

        while (t-- > 0) {
            if (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            long D = Long.parseLong(st.nextToken());
            long d = Long.parseLong(st.nextToken());
            long P = Long.parseLong(st.nextToken());
            long Q = Long.parseLong(st.nextToken());

            long q = D / d;  // full blocks
            long r = D % d;  // leftover days

            long blockSum = d * (q * P + Q * q * (q - 1) / 2);
            long leftover = r * (P + q * Q);

            long total = blockSum + leftover;
            
            // Using StringBuilder to buffer the output for faster printing
            out.append(total).append("\n");
        }
        System.out.print(out);
    }
}
