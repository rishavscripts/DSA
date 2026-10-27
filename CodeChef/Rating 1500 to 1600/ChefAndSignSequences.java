import java.util.Scanner;

public class ChefAndSignSequences {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            String s = sc.next();

            int ans = 1;
            int cnt = 0;

            char prev = '#';

            for (char c : s.toCharArray()) {
                if (c == '=') {
                    cnt = 0;
                    prev = '#';
                } else {
                    if (c == prev) {
                        cnt++;
                    } else {
                        cnt = 1;
                        prev = c;
                    }
                    ans = Math.max(ans, cnt + 1);
                }
            }

            System.out.println(ans);
        }
    }
}
