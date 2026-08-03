import java.util.*;
public class EqualizeAB {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            if(equal(a,b,x)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean equal(int a, int b, int x) {
        int diff = Math.abs(a - b);
        return diff % (2 * x) == 0;
    }
}
