import java.util.Scanner;

public class HTMLTags {
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
       // if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            
            // Minimum length of a valid tag is 4 (e.g., "</a >" -> actually "</a"> is 4)
            if (n < 4 || !s.startsWith("</") || s.charAt(n - 1) != '>') {
                System.out.println("Error");
                continue;
            }
            
            boolean isValid = true;
            // Check the body between index 2 and n - 2
            for (int i = 2; i < n - 1; i++) {
                char c = s.charAt(i);
                boolean isLowerAlpha = (c >= 'a' && c <= 'z');
                boolean isDigit = (c >= '0' && c <= '9');
                
                if (!isLowerAlpha && !isDigit) {
                    isValid = false;
                    break;
                }
            }
            
            if (isValid) {
                System.out.println("Success");
            } else {
                System.out.println("Error");
            }
        }
        sc.close();
    }
}
