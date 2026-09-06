import java.util.*;

public class ThreePowersOfTwo {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            //int n = sc.nextInt(); // take as input but not in use
            String s = sc.next();   // binary string
            long num = Long.parseLong(s, 2); // convert to number

            int setBits = Long.bitCount(num); // count 1s in binary

            if (setBits >= 3) {
                System.out.println("YES");
            } else if (setBits == 2) {
                // check if the larger power is >= 2
                int highest = 63 - Long.numberOfLeadingZeros(num);
                if (highest >= 2) System.out.println("YES");
                else System.out.println("NO");
            } else {
                System.out.println("NO");
            }
        }
    }
}
