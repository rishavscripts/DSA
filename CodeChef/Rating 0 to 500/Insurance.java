import java.util.Scanner;

public class Insurance {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y<x){System.out.println(y);}
            else{System.out.println(x);}
        }
	}
}
