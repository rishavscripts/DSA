import java.util.*;
public class FarmersLeague {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int ans = 3 * (n / 2);
            System.out.println(ans);
        }
    }
}
