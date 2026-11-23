import java.util.Scanner;

public class MissingaPoint {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            long xorX = 0;
            long xorY = 0;

            int points = 4 * n - 1;

            for (int i = 0; i < points; i++) {
                long x = sc.nextLong();
                long y = sc.nextLong();

                xorX ^= x;
                xorY ^= y;
            }

            System.out.println(xorX + " " + xorY);
        }
    }
}
