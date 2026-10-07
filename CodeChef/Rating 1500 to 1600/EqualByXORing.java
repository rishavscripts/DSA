import java.util.*;
public class EqualByXORing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            int c = a ^ b;

            if (c == 0) {
                System.out.println(0);
            } else if (c < n) {
                System.out.println(1);
            } else if ((c ^ (n - 1)) < n) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }
        }
    }
}
