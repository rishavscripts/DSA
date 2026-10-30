import java.util.*;
public class YetAnotherConstructiveProblem {
    static Scanner sc = new Scanner(System.in);
      public static void main(String[] args) {
      //  Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        long P1 = 1L << 27;
        long P2 = 1L << 28;

        while (T-- > 0) {
            long x = sc.nextLong();

            System.out.println(x + " " + (x + P1) + " " + (x + P2));
        }
    } 
}
