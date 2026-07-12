import java.util.Scanner;

public class ManaPoints {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y<x){System.out.println(0);}
            else{System.out.println(y/x);}
        }
	}
}
