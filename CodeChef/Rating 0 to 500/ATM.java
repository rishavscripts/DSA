import java.util.Scanner;

public class ATM {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        
        // Use int for X as it must be a multiple of 5
        int X = sc.nextInt();
        double Y = sc.nextDouble();

        // Check if X is a multiple of 5 AND if there is enough balance
        if (X % 5 == 0 && (X + 0.50) <= Y) {
            Y = Y - X - 0.50;
        }

        // Always print the balance formatted to 2 decimal places
        System.out.printf("%.2f\n", Y);
        sc.close();
    }
}
