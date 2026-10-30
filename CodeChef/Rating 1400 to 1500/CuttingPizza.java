import java.util.Scanner;

public class CuttingPizza {
    static Scanner sc = new Scanner(System.in);
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
	public static void main (String[] args) throws java.lang.Exception {
		
		int t = sc.nextInt();
		
		while (t-- > 0) {
		    int n = sc.nextInt();
		    int[] angles = new int[n];
		    for (int i = 0; i < n; i++) {
		        angles[i] = sc.nextInt();
		    }
		    
		    int currentGcd = 0;
		    
		    for (int i = 0; i < n; i++) {
		        int gap;
		        if (i == n - 1) {
		            // Wrap around from the last angle to the first angle
		            gap = (360 - angles[i]) + angles[0];
		        } else {
		            gap = angles[i + 1] - angles[i];
		        }
		        
		        if (i == 0) {
		            currentGcd = gap;
		        } else {
		            currentGcd = gcd(currentGcd, gap);
		        }
		    }
		    
		    // The number of total slices if we use the GCD as the angle per slice
		    int totalSlices = 360 / currentGcd;
		    
		    // Additional cuts needed = total slices - existing cuts
		    int additionalCuts = totalSlices - n;
		    
		    System.out.println(additionalCuts);
		}
	}
}
