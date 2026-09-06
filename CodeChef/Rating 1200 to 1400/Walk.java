import java.util.*;
public class Walk {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int max=-1,pos=0;
            for(int i=0;i<n;i++){
                if(arr[i]>max){max=arr[i]; pos=i;}
            }
            System.out.println(max+pos);
        }
    }
}
