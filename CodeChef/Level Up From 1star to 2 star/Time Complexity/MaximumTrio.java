import java.util.*;
public class MaximumTrio {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            long ans=a[n-1]*(a[n-1]-a[0]);
            System.out.println(ans);
        }
    }
}
