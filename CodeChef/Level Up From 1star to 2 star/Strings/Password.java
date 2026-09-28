import java.util.*;

public class Password {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean hasLower = false, hasUpperInside = false, hasDigitInside = false, hasSpecialInside = false;
            int n = s.length();
            
            if (n < 10) {
                System.out.println("NO");
                continue;
            }
            
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (Character.isLowerCase(c)) hasLower = true;
                if (i > 0 && i < n - 1) { // strictly inside
                    if (Character.isUpperCase(c)) hasUpperInside = true;
                    else if (Character.isDigit(c)) hasDigitInside = true;
                    else if ("@#%&?".indexOf(c) != -1) hasSpecialInside = true;
                }
            }
            
            if (hasLower && hasUpperInside && hasDigitInside && hasSpecialInside) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
