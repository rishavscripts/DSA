import java.util.Scanner;

public class DigitSumParities {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int sumN = digitSum(n);
            int sumN1 = digitSum(n + 1);

            if (sumN % 2 != sumN1 % 2) {
                System.out.println(n + 1);
            } else {
                System.out.println(n + 2);
            }
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
