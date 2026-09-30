import java.util.Scanner;

public class TurnIt {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        // Read the number of test cases
        int t = sc.nextInt();
        while(t-- > 0){
            int u = sc.nextInt();
            int v = sc.nextInt();
            int a = sc.nextInt();
            int s = sc.nextInt();
            int finalVelocitySquared = (u * u) - (2 * a * s);
            if(finalVelocitySquared <= (v * v)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
