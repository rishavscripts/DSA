import java.util.*;
public class InterestingSubarray {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long[] arr = new long[n];
            long min = Long.MAX_VALUE, max = Long.MIN_VALUE;
            long maxSquare = Long.MIN_VALUE;
            boolean isZero = false;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
                maxSquare = Math.max(maxSquare, arr[i] * arr[i]);
                if (arr[i] == 0) isZero = true;
            }

            long minValue = isZero ? 0 : min * max;
            System.out.println(minValue + " " + maxSquare);
        }
    }
}
