import java.util.Scanner;

public class TheAttackofQueen {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            System.out.println(step(n,x,y));
        }
	}
	public static int step(int n,int x, int y){
	    int straight = 2*(n-1);
	    int ul=Math.min(x-1,y-1);
	    int ur=Math.min(x-1,n-y);
	    int dl=Math.min(n-x,y-1);
	    int dr=Math.min(n-x,n-y);
	    return straight+ur+ul+dr+dl;
	}
}
