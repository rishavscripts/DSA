import java.util.HashSet;
import java.util.Scanner;

public class MaxMex {
     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int k = sc.nextInt();

            HashSet<Integer> set = new HashSet<>();

            for (int i = 0; i < n; i++) {
                set.add(sc.nextInt());
            }

            int mex = 0;

            while (true) {

                if (!set.contains(mex)) {
                    if (k > 0) {
                        k--;
                    } else {
                        break;
                    }
                }

                mex++;
            }

            System.out.println(mex);
        }
    }
}
