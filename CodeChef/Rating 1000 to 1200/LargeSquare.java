import java.util.Scanner;

public class LargeSquare {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int x=1;
            for(int i=0;i*i<=n;i++){
                if(i*i<=n) x=i;
            }
            System.out.println(x*a);
        }
	}
}
