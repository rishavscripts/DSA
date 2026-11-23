import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortVersion3Pair {
    static Scanner sc = new Scanner(System.in);

    static class Pair {
        long a;
        long b;

        Pair(long a, long b) {
            this.a = a;
            this.b = b;
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        long[] A = new long[n];
        long[] B = new long[n];

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextLong();
        }

        for (int i = 0; i < n; i++) {
            B[i] = sc.nextLong();
        }

        ArrayList<Pair> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            list.add(new Pair(A[i], B[i]));
        }

        Collections.sort(list, (p1, p2) -> {
            if (p1.b == p2.b) {
                return Long.compare(p1.a, p2.a);
            }
            return Long.compare(p2.b, p1.b);
        });

        StringBuilder sb = new StringBuilder();

        for (Pair p : list) {
            sb.append(p.a).append(" ")
              .append(p.b).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}
