import java.util.Scanner;

public class ControlThePollution {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            
            int smoke = 0;
            
            // Calculate smoke for batches of 100 people
            int buses = n / 100;
            int busSmoke = buses * x;
            int carSmokeFor100 = buses * 25 * y;
            smoke += Math.min(busSmoke, carSmokeFor100);
            
            // Remaining people
            n = n % 100;
            
            if (n > 0) {
                // Number of cars needed for remaining people
                int cars = (n + 3) / 4; // Equivalent to Math.ceil(n / 4.0) using integer arithmetic
                int remainingCarSmoke = cars * y;
                int remainingBusSmoke = x;
                smoke += Math.min(remainingBusSmoke, remainingCarSmoke);
            }
            
            System.out.println(smoke);
        }
    }
}
