import java.util.*;
public class NoTimetoWait {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int h=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            if(check(arr,n,h,x)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
    public static boolean check(int[] arr, int n , int h, int x){
        for(int i=0;i<n;i++){
            if(arr[i]+x>=h){return true;}
        }
        return false;
    }
}
