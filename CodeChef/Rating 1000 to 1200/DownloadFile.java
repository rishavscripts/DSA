import java.util.Scanner;

public class DownloadFile {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) throws java.lang.Exception
    {
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int totalCost = 0;
            
            for (int i = 0; i < n; i++) {
                int t = sc.nextInt();
                int d = sc.nextInt();
                
                // If the duration is less than or equal to the remaining free minutes (k)
                if (t < k) {
                    k -= t;
                } else {
                    // We have to pay for the minutes that exceed k
                    totalCost += (t - k) * d;
                    k = 0; // All free minutes are now exhausted
                }
            }
            
            System.out.println(totalCost);
        }
    }
}
