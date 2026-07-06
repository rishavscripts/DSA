import java.util.Scanner;
public class RecentContestProblems {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int start38Count = 0;
                int ltime108Count = 0;
                
                for (int i = 0; i < n; i++) {
                    String str = sc.next();
                    if (str.equals("START38")) {
                        start38Count++;
                    } else if (str.equals("LTIME108")) {
                        ltime108Count++;
                    }
                }
                System.out.println(start38Count + " " + ltime108Count);
            }
    }
}
