import java.util.*;
public class MinimumDeletions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}

            // gcd of all the elements
            int g=arr[0];
            for(int i=1;i<n;i++){
                g=gcd(g,arr[i]);
            }
            if(g==1){System.out.println(0);}
            else{System.out.println(-1);}

        }
    }
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
