import java.util.*;
public class MakeItDivisible {
     static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            
            if (n == 1) {
                System.out.println(3);
            } else {
                System.out.print(3);
                for (int i = 0; i < n - 2; i++) {
                    System.out.print(0);
                }
                System.out.println(3);
            }
        }
    }
}
