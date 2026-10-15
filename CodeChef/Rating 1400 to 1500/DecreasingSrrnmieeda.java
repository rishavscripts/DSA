import java.util.Scanner;

public class DecreasingSrrnmieeda {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            long l=sc.nextLong();
            long r=sc.nextLong();
            if (r >= 2 * l) {
                System.out.println(-1);
            } else {
                System.out.println(r);
            }
        }
	}
}
