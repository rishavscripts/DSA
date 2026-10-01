import java.util.*;
public class Pushpa {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            if(n==1) System.out.println(a[n-1]+1);
            else System.out.println(a[n-1]);
        }
    }
}
