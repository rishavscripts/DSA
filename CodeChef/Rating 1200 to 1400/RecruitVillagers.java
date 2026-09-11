import  java.util.*;
public class RecruitVillagers {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        long m = sc.nextLong();
        long c = sc.nextLong();

        long abovePower = 0, belowPower = 0;

        for (int i = 0; i < n; i++) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long p = sc.nextLong();

            long riverY = m * x + c;
            if (y > riverY) {
                abovePower += p;
            } else {
                belowPower += p;
            }
        }

        System.out.println(Math.max(abovePower, belowPower));

    }
}
