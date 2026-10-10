import java.util.Arrays;
import java.util.Scanner;

public class RemoveElement {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a= new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            if(n==1) {System.out.println("YES"); continue;}
            else{
                Arrays.sort(a);
                if (a[0] + a[n - 1] <= k) System.out.println("YES");
                else System.out.println("NO");
            }
        }
	}
}
