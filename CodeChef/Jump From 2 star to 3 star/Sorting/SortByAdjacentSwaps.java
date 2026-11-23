import java.util.ArrayList;
import java.util.Scanner;

public class SortByAdjacentSwaps {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        ArrayList<Integer> swaps = new ArrayList<>();

        for (int i = 1; i < n; i++) {

            int j = i;

            while (j > 0 && arr[j] < arr[j - 1]) {

                long temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;

                swaps.add(j - 1);

                j--;
            }
        }

        System.out.println(swaps.size());

        if (!swaps.isEmpty()) {
            StringBuilder sb = new StringBuilder();

            for (int idx : swaps) {
                sb.append(idx).append(" ");
            }

            System.out.println(sb.toString().trim());
        }
    }
}
