import java.util.Scanner;

public class ChefAndStrings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long sum = 0;
            for (int i = 1; i < n; i++) {
                sum += Math.abs(arr[i - 1] - arr[i]) - 1;
            }

            System.out.println(sum);
        }
    }
}
