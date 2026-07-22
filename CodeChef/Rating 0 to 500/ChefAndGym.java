import java.util.Scanner;

public class ChefAndGym {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    if(z<x){System.out.println(0);}
		    else if(z>=x && z<x+y){System.out.println(1);}
		    else{System.out.println(2);}
		}
	}
}
