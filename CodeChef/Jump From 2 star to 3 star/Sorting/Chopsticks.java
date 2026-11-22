import java.util.*;
public class Chopsticks {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int n = sc.nextInt();
        long d = sc.nextLong();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        int pairs = 0;
        int i = 1;

        while (i < n) {
            if (arr[i] - arr[i - 1] <= d) {
                pairs++;
                i += 2; // use both sticks
            } else {
                i++; // skip smaller stick
            }
        }

        System.out.println(pairs);
    }
}
