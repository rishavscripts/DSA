import java.util.*;
public class MaximumWeightDifference {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int sum=0;
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt(); sum+=a[i];}
            Arrays.sort(a);
            int kid=0,dad=0;
            for(int i=0;i<k;i++){kid+=a[i];}
            dad=sum-kid;
            System.out.println(dad-kid);
        }
    }
}
