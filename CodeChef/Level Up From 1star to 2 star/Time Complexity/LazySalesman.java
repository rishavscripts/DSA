import java.util.*;
public class LazySalesman {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int w=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            Arrays.sort(a);
            int sum=0, count=0;
            for(int i=n-1;i>=0;i--){
                sum+=a[i]; count++;
                if(sum>=w) break;
            }
            System.out.println(n-count);
        }
    }
}
