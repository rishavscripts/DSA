import java.util.Scanner;

public class MiamiGP {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            double x=sc.nextInt();
            double y=sc.nextInt();
            if(y<=x*1.07){System.out.println("YES");}
            else{System.out.println("NO");}
        }
	}
}
