import java.util.Scanner;

public class AirlineRestrictions {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            int e=sc.nextInt();
            
            if(a+b<=d && c<=e){System.out.println("YES");}
            else if(b+c<=d && a<=e){System.out.println("YES");}
            else if(a+c<=d && b<=e){System.out.println("YES");}
            else{System.out.println("NO");;}
        }
	}
}
