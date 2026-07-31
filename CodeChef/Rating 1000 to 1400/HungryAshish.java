import java.util.Scanner;

public class HungryAshish {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here  
		int t=sc.nextInt();
		while(t-->0){
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int z=sc.nextInt();
		    if(y<=x && z>x){System.out.println("PIZZA");}
		    else if(z<=x && y>x){System.out.println("BURGER");}
		    else if(y<=x && z<=x){System.out.println("PIZZA");}
		    else{System.out.println("NOTHING");}
		}
	}
}
