import java.util.*;
public class ReversalSorting {
    static Scanner sc =  new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] a= new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            boolean possible = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i+1] && a[i] + a[i+1] > x) {
                    possible = false;
                    break;
                }
            }
            System.out.println(possible ? "YES" : "NO");
        }
    }
}
