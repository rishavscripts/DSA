import java.util.Scanner;

public class ChefAndCoinsGame {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                
                // If N is a multiple of 6, Misha wins. Otherwise, Chef wins.
                if (n % 6 == 0) {
                    System.out.println("Misha");
                } else {
                    System.out.println("Chef");
                }
            }
        }
    }
}
