import java.util.*;
public class ChefAndAdventures {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            
            // Adjust N and M to represent how much needs to be added via steps of X and Y
            long remN1 = n - 1;
            long remM1 = m - 1;
            
            long remN2 = n - 2;
            long remM2 = m - 2;
            
            // Check condition 1: Reachable without ShareChat
            boolean possible1 = (remN1 >= 0 && remN1 % x == 0) && (remM1 >= 0 && remM1 % y == 0);
            
            // Check condition 2: Reachable with ShareChat (used once)
            boolean possible2 = (remN2 >= 0 && remN2 % x == 0) && (remM2 >= 0 && remM2 % y == 0);
            
            if (possible1 || possible2) {
                System.out.println("Chefirnemo");
            } else {
                System.out.println("Pofik");
            }
        }
	}
}
