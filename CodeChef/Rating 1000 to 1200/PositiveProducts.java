import java.util.Scanner;

public class PositiveProducts {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            long pos=pos(arr);
            long neg=neg(arr);
            long ans = (pos * (pos - 1)) / 2 + (neg * (neg - 1)) / 2;
            System.out.println(ans);
        }
	}
	public static long pos(int[] arr){
	    long count=0;
	    for(int i:arr){
	        if(i>0) count++;
	    }
	    return count;
	}
	public static long neg(int[] arr){
	    long count=0;
	    for(int i:arr){
	        if(i<0) count++;
	    }
	    return count;
	}
}
