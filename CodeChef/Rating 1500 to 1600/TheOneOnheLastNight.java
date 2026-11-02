import java.util.*;
public class TheOneOnheLastNight {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {
            long N = sc.nextLong();
            long K = sc.nextLong();

            PriorityQueue<Integer> pq = new PriorityQueue<>();

            for (char c : String.valueOf(N).toCharArray()) {
                pq.add(c - '0');
            }

            while (K > 0) {
                int d = pq.poll();

                if (d == 9) {
                    pq.add(d);
                    break;
                }

                pq.add(d + 1);
                K--;
            }

            long product = 1;

            while (!pq.isEmpty()) {
                product *= pq.poll();
            }

            System.out.println(product);
        }
    }
}
