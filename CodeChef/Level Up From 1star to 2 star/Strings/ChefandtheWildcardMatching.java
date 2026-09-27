import java.util.*;
public class ChefandtheWildcardMatching {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String x = sc.next();
            String y = sc.next();
            boolean f = true;
            int len = x.length();

            for (int i = 0; i < len; i++) {
                char a = x.charAt(i);
                char b = y.charAt(i);
                if (a == b || a == '?' || b == '?') {
                    continue;
                } else {
                    f = false;
                    break;
                }
            }

            if (f) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}
