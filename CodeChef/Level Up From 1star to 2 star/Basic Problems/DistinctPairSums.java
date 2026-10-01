import java.util.Scanner;

public class DistinctPairSums {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            long l = sc.nextLong();
                long r = sc.nextLong();
                long ans = 2 * (r - l) + 1;
                System.out.println(ans);
            
        }
	}
}
