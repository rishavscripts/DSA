import java.util.*;

public class EVMHacking {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] got = new int[3];
            int[] total = new int[3];

            for (int i = 0; i < 3; i++) got[i] = sc.nextInt();
            for (int i = 0; i < 3; i++) total[i] = sc.nextInt();

            double avg = (total[0] + total[1] + total[2]) / 2.0; // fix denominator
            int totalGot = got[0] + got[1] + got[2];

            if (totalGot > avg) {
                System.out.println("YES");
            } else {
                boolean flag = false;
                if (total[0] + got[1] + got[2] > avg) flag = true;
                else if (got[0] + total[1] + got[2] > avg) flag = true;
                else if (got[0] + got[1] + total[2] > avg) flag = true;

                if (flag) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
