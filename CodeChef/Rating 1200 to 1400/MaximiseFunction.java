import java.util.*;
public class MaximiseFunction {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int sum=2*(max(arr)-min(arr));
            System.out.println(sum);
        }
    }
    public static int max(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i:arr){
            if(max<i) max=i;
        }
        return max;
    }
    public  static  int min(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i:arr){
            if(min>i) min=i;
        }
        return min;
    }
}
