import java.util.ArrayList;
import java.util.Scanner;

public class IronMagnetAndWall {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            String s = sc.next();

            int[] prefix = new int[n];

            prefix[0] = (s.charAt(0) == ':') ? 1 : 0;

            for (int i = 1; i < n; i++) {
                prefix[i] = prefix[i - 1]
                        + (s.charAt(i) == ':' ? 1 : 0);
            }

            int answer = 0;

            int start = 0;

            while (start < n) {

                int end = start;

                while (end < n && s.charAt(end) != 'X') {
                    end++;
                }

                ArrayList<Integer> irons = new ArrayList<>();
                ArrayList<Integer> magnets = new ArrayList<>();

                for (int i = start; i < end; i++) {

                    if (s.charAt(i) == 'I') {
                        irons.add(i);
                    } else if (s.charAt(i) == 'M') {
                        magnets.add(i);
                    }
                }

                int i = 0;
                int j = 0;

                while (i < irons.size() && j < magnets.size()) {

                    int iron = irons.get(i);
                    int magnet = magnets.get(j);

                    int sheets =
                            Math.abs(prefix[iron] - prefix[magnet]);

                    int power =
                            k + 1
                            - Math.abs(iron - magnet)
                            - sheets;

                    if (power > 0) {
                        answer++;
                        i++;
                        j++;
                    } else {

                        if (iron < magnet) {
                            i++;
                        } else {
                            j++;
                        }
                    }
                }

                start = end + 1;
            }

            System.out.println(answer);
        }
    }
}
