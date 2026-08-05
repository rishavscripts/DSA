import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int k=sc.nextInt();
            int target=arr[k-1];
            Arrays.sort(arr);
            for(int i=0;i<n;i++){
                if(arr[i]==target){System.out.println(i+1); break;}
            }
        }
	}
}
