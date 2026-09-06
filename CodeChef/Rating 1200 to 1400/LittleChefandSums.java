import java.util.*;
public class LittleChefandSums {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int min=Integer.MAX_VALUE,ans=-1;
            for(int i=0;i<n;i++){
                if(prefixSum(arr, n, i)+suffixSum(arr,n, i)<min){min=prefixSum(arr, n, i)+suffixSum(arr,n, i); ans=i;}
            }
            System.out.println(ans);
        }
    }
    public static int prefixSum(int[] arr, int n, int i){
       int sum=0;
       for(int k=0;k<=i;k++){sum+=arr[k];}
       return sum;
    }
    public static int suffixSum(int[] arr, int n, int i){
        int sum=0;
        for(int k=i;k<n;k++){sum+=arr[k];}
        return sum;
    }
}
