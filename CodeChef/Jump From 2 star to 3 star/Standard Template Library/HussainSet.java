import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HussainSet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        int m = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        // reverse to descending order
        for (int i = 0; i < n / 2; i++) {
            long temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        int[] query = new int[m];
        int maxQ = 0;

        for (int i = 0; i < m; i++) {
            query[i] = sc.nextInt();
            maxQ = Math.max(maxQ, query[i]);
        }

        long[] answers = new long[maxQ + 1];
        ArrayList<Long> generated = new ArrayList<>();

        int i = 0;      // pointer in original array
        int j = 0;      // pointer in generated array

        for (int move = 1; move <= maxQ; move++) {

            long original = (i < n) ? arr[i] : -1;
            long generatedVal = (j < generated.size()) ? generated.get(j) : -1;

            long chosen;

            if (original >= generatedVal) {
                chosen = original;
                i++;
            } else {
                chosen = generatedVal;
                j++;
            }

            answers[move] = chosen;

            long half = chosen / 2;

            if (half > 0) {
                generated.add(half);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int q : query) {
            sb.append(answers[q]).append("\n");
        }

        System.out.print(sb);
    }
}
