import java.util.Scanner;

public class CoupleGame {
    
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int g=sc.nextInt();
            int b=sc.nextInt();
            System.out.println(b-g);
        }
	}
}
