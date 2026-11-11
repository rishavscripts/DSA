import java.util.Scanner;

public class AlternatingDivisibility {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            StringBuilder sb = new StringBuilder();
            
            while (t-- > 0) {
                int n = scanner.nextInt();
                int x = n - (n / 2) + 1;
                
                for (int i = 0; i < n / 2; i++) {
                    sb.append((x + i)).append(" ").append(2 * (x + i)).append(" ");
                }
                
                // If N is odd, append the remaining single element
                if (n % 2 != 0) {
                    sb.append(x + (n / 2)).append(" ");
                }
                sb.append("\n");
            }
            
            System.out.print(sb);
        }
        
        scanner.close();
    }
}
