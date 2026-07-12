import java.util.Scanner;

public class MessiVsRonaldo {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=sc.nextInt();
        int y=sc.nextInt();
        
        int Messi=2*a+b;
        int Ronaldo=2*x+y;
        if(Messi>Ronaldo){System.out.println("Messi");}
        else if(Messi<Ronaldo){System.out.println("Ronaldo");}
        else{System.out.println("Equal");}
	}
}
