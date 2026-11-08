import java.util.Scanner;

public class ChefAndThreeDogs{
        static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t = sc.nextInt();
            while (t-- > 0) {
                double s = sc.nextDouble();
                double v = sc.nextDouble();
                
                // Formula: (2 * s) / (3 * v)
                double ans = (2.0 * s) / (3.0 * v);
                
                // Print the result formatted to standard precision
                System.out.printf("%.7f\n", ans);
            }
	}
}