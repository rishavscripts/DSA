import java.util.Scanner;

public class GameofPooks {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n==2 || n==3){System.out.println(n-1);}
            else{System.out.println(n);}
        }
	}
}
