import java.util.Scanner;

public class MonopolyinChefland {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t=sc.nextInt();
		while(t-->0){
		    int r1=sc.nextInt();
		    int r2=sc.nextInt();
		    int r3=sc.nextInt();
		    
		    if(r1>r2+r3){System.out.println("YES");}
		    else if(r2>r3+r1){System.out.println("YES");}
		    else if(r3>r1+r2){System.out.println("YES");}
		    else{System.out.println("NO");}
		}
	}
}
