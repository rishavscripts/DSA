import java.util.*;
public class Lapindromes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String s=sc.next();
            int len = s.length();
            String first, second;
            if (len % 2 == 0) {
                first = s.substring(0, len / 2);
                second = s.substring(len / 2);
            } else {
                first = s.substring(0, len / 2);
                second = s.substring(len / 2 + 1);
            }
            char[] a=first.toCharArray();
            char[] b=second.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
