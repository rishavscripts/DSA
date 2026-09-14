import java.util.*; 
public class TheBallAndCups {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
           // int n = sc.nextInt();
            int c = sc.nextInt();
            int q = sc.nextInt();
            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                if (c >= l && c <= r) {
                    c = l + (r - c); // mirror position
                }
            }
            System.out.println(c);
        }
    }
}
