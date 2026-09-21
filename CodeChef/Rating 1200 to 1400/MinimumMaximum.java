import java.util.*;
public class MinimumMaximum {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int min=arr[0];
            for(int i:arr){
                min=Math.min(min,i);
            }
            System.out.println((long)(n-1)*min);
        }
    }
}
