import java.util.Scanner;

public class BucketWaterflow {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int w=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int rem=x-w;
            int take=y*z;
            if(rem==take){System.out.println("filled");}
            else if(rem>take){System.out.println("unfilled");}
            else{System.out.println("overflow");}
        }
	}
}
