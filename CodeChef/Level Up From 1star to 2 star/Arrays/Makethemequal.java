import java.util.*;
public class Makethemequal {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int max=Integer.MIN_VALUE;
            int min=Integer.MAX_VALUE;
            for(int i:arr){
                max=Math.max(i,max);
                min=Math.min(i,min);
            }
            System.out.println(Math.abs(max-min));
        }
    }
}
