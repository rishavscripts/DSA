import java.util.*;
public class CookingMachine {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int steps = 0;

            // Reduce A until it becomes a power of 2
            while ((a & (a - 1)) != 0) { // check if not power of 2
                if (a % 2 == 0) a /= 2;
                else a = (a - 1) / 2;
                steps++;
            }

            // Now A is a power of 2
            while (a != b) {
                if (a < b) a *= 2;
                else a /= 2;
                steps++;
            }

            System.out.println(steps);
        }
    }
}
