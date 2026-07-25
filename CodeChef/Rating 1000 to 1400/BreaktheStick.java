import java.util.Scanner;

public class BreaktheStick {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            if(check(n)){System.out.println("YES");}
            else if(!check(n)&&check(x)){System.out.println("NO");}
            else{System.out.println("YES");}
        }
	}
	public static boolean check(int a){
	    if(a%2==0){return true;}
	    else{return false;}
	}
}
