import java.util.Scanner;

public class ChefAndSteps {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            long k = sc.nextLong(); // K can be up to 10^9
            
            for(int i = 0; i < n; i++){
                long distance = sc.nextLong(); // Distance can be up to 10^9
                
                // Check if the distance is divisible by Chef's step length K
                if(distance % k == 0){
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }
            System.out.println(); // Print a newline after each test case
        }
	}
}
