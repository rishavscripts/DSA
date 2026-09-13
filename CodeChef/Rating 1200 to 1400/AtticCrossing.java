import java.util.*;
public class AtticCrossing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            String p=sc.next();
            int days = 0;
            int currentJump = 1;
            int gap = 0;

            for (int i = 0; i < p.length(); i++) {
                if (p.charAt(i) == '.') {
                    gap++;
                } else { // found a floorboard
                    if (gap > 0) {
                        int requiredJump = gap + 1;
                        if (requiredJump > currentJump) {
                            days++;
                            currentJump = requiredJump;
                        }
                        gap = 0;
                    }
                }
            }
            System.out.println(days);
        }
    }
}
