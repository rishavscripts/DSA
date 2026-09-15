import java.util.Scanner;

public class CacheHits {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            //int n = sc.nextInt();
            int b = sc.nextInt();
            int m = sc.nextInt();
            int[] x = new int[m];
            for (int i = 0; i < m; i++) x[i] = sc.nextInt();

            int loads = 0;
            int cacheBlock = -1;

            for (int i = 0; i < m; i++) {
                int block = x[i] / b;
                if (block != cacheBlock) {
                    loads++;
                    cacheBlock = block;
                }
            }

            System.out.println(loads);
        }
    }
}
