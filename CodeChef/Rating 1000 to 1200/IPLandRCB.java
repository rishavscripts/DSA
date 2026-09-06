import java.util.Scanner;

public class IPLandRCB {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                
                System.out.println(Math.max(0,x-y));
            }
        }
        
    }
}
