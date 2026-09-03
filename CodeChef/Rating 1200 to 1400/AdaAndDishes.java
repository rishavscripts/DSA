import java.util.*;
public class AdaAndDishes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int b1=0,b2=0;
            Arrays.sort(arr);
            for(int i=arr.length-1;i>=0;i--){
                if(b1<=b2) b1+=arr[i];
                else b2+=arr[i];
            }
            System.out.println(Math.max(b1,b2));
        }
    }
}
