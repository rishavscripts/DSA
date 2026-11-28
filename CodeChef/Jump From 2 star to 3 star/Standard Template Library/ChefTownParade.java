import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ChefTownParade {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int w = sc.nextInt();

        int[] h = new int[n];

        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        Deque<Integer> minDeque = new ArrayDeque<>();
        Deque<Integer> maxDeque = new ArrayDeque<>();

        int count = 0;

        for (int i = 0; i < n; i++) {

            while (!minDeque.isEmpty() &&
                    h[minDeque.peekLast()] >= h[i]) {
                minDeque.pollLast();
            }

            while (!maxDeque.isEmpty() &&
                    h[maxDeque.peekLast()] <= h[i]) {
                maxDeque.pollLast();
            }

            minDeque.addLast(i);
            maxDeque.addLast(i);

            while (minDeque.peekFirst() <= i - w) {
                minDeque.pollFirst();
            }

            while (maxDeque.peekFirst() <= i - w) {
                maxDeque.pollFirst();
            }

            if (i >= w - 1) {

                int mn = h[minDeque.peekFirst()];
                int mx = h[maxDeque.peekFirst()];

                if (mx - mn == w - 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
