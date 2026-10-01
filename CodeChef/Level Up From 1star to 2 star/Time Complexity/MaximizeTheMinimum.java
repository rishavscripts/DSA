import java.util.*;
public class MaximizeTheMinimum {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            int max = Arrays.stream(a).max().getAsInt();

            if (k >= n - 1) {
                System.out.println(max);
            } else {
                int leftMax = 0, rightMax = 0;
                for (int i = 0; i <= k; i++) leftMax = Math.max(leftMax, a[i]);
                for (int i = n - 1; i >= n - 1 - k; i--) rightMax = Math.max(rightMax, a[i]);
                System.out.println(Math.max(leftMax, rightMax));
            }
        }
    }
}
