import java.util.Scanner;

public class SplitandMaximize {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            int s=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt(); s+=arr[i];
            }
            int ans = (s*s)*s;
            System.out.println(ans%998244353);            
        }
    }
}
