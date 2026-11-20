import java.util.Scanner;

public class TurnIt {
    static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            
            // Using the kinematic equation squared: v^2 >= u^2 - 2*a*s
            int finalVelocitySquared = (u * u) - (2 * a * s);
            
            if ((v * v) >= finalVelocitySquared) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
