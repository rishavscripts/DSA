import java.util.Scanner;

public class ReadPages{
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(n<=(x*y)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}