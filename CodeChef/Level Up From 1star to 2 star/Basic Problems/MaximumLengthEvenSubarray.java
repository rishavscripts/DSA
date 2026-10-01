import java.util.Scanner;

public class MaximumLengthEvenSubarray {
    static Scanner sc = new Scanner(System.in);
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long sum = (n * (n + 1)) / 2;
            if (sum % 2 != 0) {
                System.out.println(n - 1);
            } else {
                System.out.println(n);
            }
        }
	}
}
