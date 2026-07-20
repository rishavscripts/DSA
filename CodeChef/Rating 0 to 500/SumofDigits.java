import java.util.Scanner;

public class SumofDigits {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.println(sum(n));
        }
	}
	public static int sum(int n){
	    int sum=0;
	    while(n>0){
	        int rem=n%10;
	        sum+=rem;
	        n/=10;
	    }
	    return sum;
	}
}
