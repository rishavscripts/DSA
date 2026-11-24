import java.util.Scanner;

public class FluShotLineup {
    static Scanner sc = new Scanner(System.in);

    static int n;
    static double t;
    static double[] x;

    static boolean possible(double d) {

        double prev = -1e18;

        for (int i = 0; i < n; i++) {

            double left = Math.max(0.0, x[i] - d);
            double right = x[i] + d;

            double pos = Math.max(left, prev + t);

            if (pos > right) {
                return false;
            }

            prev = pos;
        }

        return true;
    }

    public static void main(String[] args) {

        int tc = sc.nextInt();

        while (tc-- > 0) {

            n = sc.nextInt();
            t = sc.nextDouble();

            x = new double[n];

            for (int i = 0; i < n; i++) {
                x[i] = sc.nextDouble();
            }

            double low = 0.0;
            double high = 1000000.0;

            for (int it = 0; it < 70; it++) {

                double mid = (low + high) / 2.0;

                if (possible(mid)) {
                    high = mid;
                } else {
                    low = mid;
                }
            }

            System.out.printf("%.4f\n", high);
        }
    }
}
