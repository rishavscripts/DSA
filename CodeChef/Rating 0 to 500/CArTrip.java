import java.util.Scanner;

public class CArTrip {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            System.out.println(Math.max((3000),(x*10)));
        }
	}
}
