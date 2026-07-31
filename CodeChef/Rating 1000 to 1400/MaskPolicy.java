import java.util.Scanner;

public class MaskPolicy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); // total population
            int a = sc.nextInt(); // infected
            int b = n-a; // not infected

            System.out.println(Math.min(a, b));
        }
    }
}
