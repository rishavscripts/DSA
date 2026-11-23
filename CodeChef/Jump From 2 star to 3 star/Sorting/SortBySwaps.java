import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SortBySwaps {
    static Scanner sc = new Scanner(System.in);

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

    public static void main(String[] args) {

        int n = sc.nextInt();

        Pair[] arr = new Pair[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Pair(sc.nextInt(), i);
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a.value, b.value));

        int[] pos = new int[n];

        for (int i = 0; i < n; i++) {
            pos[arr[i].index] = i;
        }

        ArrayList<int[]> swaps = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            while (pos[i] != i) {

                int j = pos[i];

                swaps.add(new int[]{i, j});

                int temp = pos[i];
                pos[i] = pos[j];
                pos[j] = temp;
            }
        }

        System.out.println(swaps.size());

        for (int[] s : swaps) {
            System.out.println(s[0] + " " + s[1]);
        }
    }
}
