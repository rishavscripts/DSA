import java.util.Scanner;

public class ElectionsInChefland {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int xa=sc.nextInt();
            int xb=sc.nextInt();
            int xc=sc.nextInt();
            if(xa>50){System.out.println("A");}
            else if(xb>50){System.out.println("B");}
            else if(xc>50){System.out.println("C");}
            else{System.out.println("NOTA");}
        }
	}
}
