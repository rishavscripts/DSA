import java.util.Scanner;

public class RetrieveTheArray {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t=sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] b = new long[n];
            long sum = 0;
            
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
                sum += b[i];
            }
            
            long aSum = sum / (n + 1);
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = b[i] - aSum;
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
	}
}
