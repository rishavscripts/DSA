import java.util.Scanner;

public class TheGift {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int x=sc.nextInt();
        int n=sc.nextInt();
        int m=sc.nextInt();     
        
        if(x+m>=n){System.out.println("YES");}
        else{System.out.println("NO");}
	}
}
