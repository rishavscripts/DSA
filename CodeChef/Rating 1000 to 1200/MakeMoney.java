import java.util.Scanner;

public class MakeMoney {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int c=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int max=0;
            for(int i=0;i<n;i++){
                max+=Math.max(arr[i],x-c);
            }
            System.out.println(max);
        }
	}
}
