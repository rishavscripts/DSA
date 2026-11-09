import java.util.Scanner;

public class OrderByXOR {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws java.lang.Exception {
        
        int t = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            int x = 0;
            
            // Iterate from the 29th bit down to the 0th bit
            for (int bit = 29; bit >= 0; bit--) {
                int abit = (a >> bit) & 1;
                int bbit = (b >> bit) & 1;
                int cbit = (c >> bit) & 1;
                
                int flip = 0;
                if (a > b && abit > bbit) flip = 1;
                if (b > c && bbit > cbit) flip = 1;
                if (a > c && abit > cbit) flip = 1;
                
                if (flip == 1) {
                    a ^= (1 << bit);
                    b ^= (1 << bit);
                    c ^= (1 << bit);
                    x ^= (1 << bit);
                }
            }
            
            if (a < b && b < c) {
                sb.append(x).append("\n");
            } else {
                sb.append(-1).append("\n");
            }
        }
        
        System.out.print(sb);
        sc.close();
    }
}
