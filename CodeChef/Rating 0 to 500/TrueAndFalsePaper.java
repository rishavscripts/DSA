import java.util.Scanner;

public class TrueAndFalsePaper {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k=sc.nextInt();
            
            System.out.println(n-k);
        }
	}
}
