import java.util.Scanner;

public class ChefAndSquares {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int K = sc.nextInt();

            int shift = K / 2;

            for (int i = 0; i < K; i++) {
                int start = (i + shift) % K;

                for (int j = 0; j < K; j++) {
                    int val = (start + j) % K + 1;
                    System.out.print(val);

                    if (j + 1 < K) System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
