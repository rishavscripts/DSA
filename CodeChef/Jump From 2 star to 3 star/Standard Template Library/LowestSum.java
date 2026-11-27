import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class LowestSum {
    static Scanner sc = new Scanner(System.in);

    static class Node {
        long sum;
        int i;
        int j;

        Node(long sum, int i, int j) {
            this.sum = sum;
            this.i = i;
            this.j = j;
        }
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int k = sc.nextInt();
            int q = sc.nextInt();

            long[] A = new long[k];
            long[] B = new long[k];

            for (int i = 0; i < k; i++) {
                A[i] = sc.nextLong();
            }

            for (int i = 0; i < k; i++) {
                B[i] = sc.nextLong();
            }

            int[] queries = new int[q];
            int maxQuery = 0;

            for (int i = 0; i < q; i++) {
                queries[i] = sc.nextInt();
                maxQuery = Math.max(maxQuery, queries[i]);
            }

            Arrays.sort(A);
            Arrays.sort(B);

            PriorityQueue<Node> pq =
                    new PriorityQueue<>((a, b) -> Long.compare(a.sum, b.sum));

            for (int i = 0; i < k; i++) {
                pq.add(new Node(A[i] + B[0], i, 0));
            }

            long[] smallest = new long[maxQuery];

            for (int idx = 0; idx < maxQuery; idx++) {

                Node cur = pq.poll();

                smallest[idx] = cur.sum;

                if (cur.j + 1 < k) {
                    pq.add(new Node(
                            A[cur.i] + B[cur.j + 1],
                            cur.i,
                            cur.j + 1
                    ));
                }
            }

            for (int query : queries) {
                System.out.println(smallest[query - 1]);
            }
        }
    }
}
