import java.util.Scanner;

public class BrokenPhone {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x<y){System.out.println("REPAIR");}
            else if(y<x){System.out.println("NEW PHONE");}
            else{System.out.println("ANY");}
        }
	}
}
