import java.util.Scanner;

public class MakeArrayOdd {
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            
            int evenCount = 0;
            int oddCount = 0;
            
            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();
                if (a % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            
            long ans = 0;
            if (evenCount == 0) {
                ans = 0;
            } else if (x % 2 == 1) {
                ans = (evenCount + 1) / 2;
            } else {
                if (oddCount == 0) {
                    ans = -1;
                } else {
                    ans = evenCount;
                }
            }
            
            System.out.println(ans);
        }
    }
}
