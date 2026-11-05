import java.util.Scanner;

public class MagicalPlanks {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        
        StringBuilder out = new StringBuilder();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            
            int grps_b = 0;
            int grps_w = 0;
            
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'W') {
                    grps_w++;
                    while (i < n && s.charAt(i) == 'W') {
                        i++;
                    }
                    i--; 
                } else {
                    grps_b++;
                    while (i < n && s.charAt(i) == 'B') {
                        i++;
                    }
                    i--; 
                }
            }
            
            out.append(Math.min(grps_b, grps_w)).append("\n");
        }
        
        System.out.print(out);
    }
}
