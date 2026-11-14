import java.util.Scanner;

public class ChefGoesToTheCinema {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            long x = sc.nextLong();
            long k = 0;
            while ((k + 1) * (k + 2) / 2 <= x) {
                k++;
            }
            long minTime = x;
            long distK = k * (k + 1) / 2;
            long timeK = k + Math.abs(x - distK);
            minTime = Math.min(minTime, timeK);
            long distKPlus1 = (k + 1) * (k + 2) / 2;
            long timeKPlus1 = (k + 1) + Math.abs(distKPlus1 - x);
            minTime = Math.min(minTime, timeKPlus1);
            System.out.println(minTime);
        }
    }
}
