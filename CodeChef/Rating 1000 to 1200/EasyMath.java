import java.util.Scanner;

public class EasyMath {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int maxDigitSum = 0;
            for (int i = 0; i < n; i++) {
                // Start j from i + 1 to choose two *different* elements
                for (int j = i + 1; j < n; j++) {   
                    int prod = arr[i] * arr[j];
                    maxDigitSum = Math.max(maxDigitSum, digitSum(prod));
                }
            }
            System.out.println(maxDigitSum);
        }
    }

    public static int digitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
