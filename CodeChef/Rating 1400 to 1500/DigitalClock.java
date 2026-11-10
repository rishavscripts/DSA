import java.util.Scanner;

public class DigitalClock {
     static Scanner scanner = new Scanner(System.in);

	public static void main (String[] args) throws java.lang.Exception
	{
		int T = scanner.nextInt();
		
		while (T-- > 0) {
		    int H = scanner.nextInt();
		    int M = scanner.nextInt();
		    
		    int count = 0;
		    
		    // Iterate through all possible hours and minutes
		    for (int h = 0; h < H; h++) {
		        for (int m = 0; m < M; m++) {
		            
		            String timeStr = Integer.toString(h) + Integer.toString(m);
		            if (isAllSame(timeStr)) {
		                count++;
		            }
		        }
		    }
		    
		    System.out.println(count);
		}
		
	}

	static boolean isAllSame(String s) {
	    for (int i = 1; i < s.length(); i++) {
	        if (s.charAt(i) != s.charAt(0)) {
	            return false;
	        }
	    }
	    return true;
	}
}
