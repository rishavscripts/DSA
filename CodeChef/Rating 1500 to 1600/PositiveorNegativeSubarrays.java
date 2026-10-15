import java.util.*;
public class PositiveorNegativeSubarrays {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
           long P = 0, Q = 0;
            for (int i = 1; i <= n; i++) {
                int b = sc.nextInt();
                if (b == 1) P += i;
                else Q += i;
            }
            System.out.println(Math.abs(P - Q));
        }
    }
}
