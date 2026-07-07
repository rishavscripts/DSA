import java.util.Scanner;
public class TheLeadGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        // N is the number of rounds
        int n = sc.nextInt();
        
        int cumScore1 = 0;
        int cumScore2 = 0;
        int maxLead = 0;
        int winner = 0;
        
        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            
            // Update cumulative scores
            cumScore1 += s1;
            cumScore2 += s2;
            
            int currentLead = cumScore1 - cumScore2;
            
            // Check if this round resulted in a new maximum lead
            if (Math.abs(currentLead) > maxLead) {
                maxLead = Math.abs(currentLead);
                // If currentLead is positive, P1 is leading, else P2
                winner = (currentLead > 0) ? 1 : 2;
            }
        }
        
        System.out.println(winner + " " + maxLead);
    }
}
