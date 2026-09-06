import java.util.Scanner;

public class HostelRoom {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int x=sc.nextInt();
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int max=x;
            for(int i=0;i<n;i++){
                x+=arr[i];
                if(x>max) max=x;
            }
            System.out.println(max);
        }
	}
}
