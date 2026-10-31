import java.util.*;
public class MissingNumbers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int T = sc.nextInt();

        while (T-- > 0) {

            long[] given = new long[4];
            for (int i = 0; i < 4; i++) {
                given[i] = sc.nextLong();
            }

            long[] sortedGiven = given.clone();
            Arrays.sort(sortedGiven);

            boolean found = false;

            for (int i = 0; i < 4 && !found; i++) {
                for (int j = 0; j < 4 && !found; j++) {

                    if (i == j) continue;

                    long S = given[i];
                    long D = given[j];

                    if ((S + D) % 2 != 0) continue;
                    if ((S - D) % 2 != 0) continue;

                    long a = (S + D) / 2;
                    long b = (S - D) / 2;

                    if (a < 1 || a > 10000) continue;
                    if (b < 1 || b > 10000) continue;

                    long[] produced = {
                        a + b,
                        a - b,
                        a * b,
                        a / b
                    };

                    Arrays.sort(produced);

                    if (Arrays.equals(sortedGiven, produced)) {
                        System.out.println(a + " " + b);
                        found = true;
                    }
                }
            }

            if (!found) {
                System.out.println("-1 -1");
            }
        }
    }
}
