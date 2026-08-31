import java.util.Scanner;

public class FarmerFeb {
    static Scanner sc = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
        int t = sc.nextInt();
        while(t-- > 0){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int bound = x + y;
            int total = nextPrime(bound);
            System.out.println(total - bound);
        }
	}
	
	public static int nextPrime(int bound){
	    int ans = bound;
	    while(true){
	        ans++;
	        if(isPrime(ans)) return ans;
	    }
	}
	
	public static boolean isPrime(int n){
	    if(n <= 1) return false;
	    if(n <= 3) return true;
	    if(n % 2 == 0 || n % 3 == 0) return false;
	    
	    
	    for(int i = 5; i * i <= n; i += 6){
	        if(n % i == 0 || n % (i + 2) == 0) return false;
	    }
	    return true;
	}
}
