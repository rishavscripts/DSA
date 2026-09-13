import java.util.Scanner;

public class ABalancedContest {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int p = sc.nextInt();
            
            int hard = 0, cakewalk = 0;
            
            for (int i = 0; i < n; i++) {
                int participants = sc.nextInt();
                
                // A problem is hard if solved by at most P / 10 participants
                if (participants <= p / 10) {
                    hard++;
                }
                // A problem is cakewalk if solved by at least P / 2 participants
                else if (participants >= p / 2) {
                    cakewalk++;
                }
            }
            
            // Check if there is exactly 1 cakewalk and exactly 2 hard problems
            if (cakewalk == 1 && hard == 2) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } 
    }
}
