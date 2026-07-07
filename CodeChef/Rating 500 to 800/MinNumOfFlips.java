import java.util.Scanner;
public class MinNumOfFlips {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){arr[i]=sc.nextInt(); sum+=arr[i];}
            if(sum==0){System.out.println(0);}
            else if(sum%2==0){System.out.println((int)Math.abs(sum/2));}
            else{System.out.println(-1);}
        }
    }
}
