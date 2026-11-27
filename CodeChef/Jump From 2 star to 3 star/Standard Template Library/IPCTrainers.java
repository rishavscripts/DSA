import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class IPCTrainers {
     static Scanner sc = new Scanner(System.in);

    static class Trainer {
        int day;
        long lectures;
        long sadness;

        Trainer(int day, long lectures, long sadness) {
            this.day = day;
            this.lectures = lectures;
            this.sadness = sadness;
        }
    }

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int d = sc.nextInt();

            Trainer[] trainers = new Trainer[n];

            for (int i = 0; i < n; i++) {

                int day = sc.nextInt();
                long lectures = sc.nextLong();
                long sadness = sc.nextLong();

                trainers[i] = new Trainer(day, lectures, sadness);
            }

            Arrays.sort(trainers, (a, b) -> a.day - b.day);

            PriorityQueue<Trainer> pq =
                    new PriorityQueue<>((a, b) ->
                            Long.compare(b.sadness, a.sadness));

            int idx = 0;

            for (int day = 1; day <= d; day++) {

                while (idx < n && trainers[idx].day == day) {
                    pq.add(trainers[idx]);
                    idx++;
                }

                if (!pq.isEmpty()) {

                    Trainer cur = pq.poll();

                    cur.lectures--;

                    if (cur.lectures > 0) {
                        pq.add(cur);
                    }
                }
            }

            long sadness = 0;

            while (!pq.isEmpty()) {

                Trainer cur = pq.poll();

                sadness += cur.lectures * cur.sadness;
            }

            System.out.println(sadness);
        }
    }
}
