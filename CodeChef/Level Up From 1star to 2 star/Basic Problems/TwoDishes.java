import java.util.Scanner;

public class TwoDishes {
    static Scanner sc= new Scanner(System.in); 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(b>=n && a+c>=n){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
