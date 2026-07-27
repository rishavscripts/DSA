import java.util.Scanner;

public class ChefAndBattery{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();
            System.out.println(minTime(N));
        }
        sc.close();
    }

    private static int minTime(int N) {
        if (N == 50) return 0;

        // Case 1: Only charging
        if (N < 50 && (50 - N) % 2 == 0) {
            return (50 - N) / 2;
        }

        // Case 2: Only discharging
        if (N > 50 && (N - 50) % 3 == 0) {
            return (N - 50) / 3;
        }

        int target = 50 - N;
        for (int x = 0; x <= 100; x++) {  
            for (int y = 0; y <= 100; y++) { 
                if (2 * x - 3 * y == target) {
                    return x + y;
                }
            }
        }
        return -1; // should never happen
    }
}
