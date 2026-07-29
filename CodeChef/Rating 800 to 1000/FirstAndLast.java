import java.util.*;
public class FirstAndLast {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int low=arr[0];
            int high=arr[0];
            for(int i=0;i<n;i++){
                if(arr[i]>high){high=arr[i];}
                if(arr[i]<low){low=arr[i];}
            }
            System.out.println(high+low);
        }
    }
}
