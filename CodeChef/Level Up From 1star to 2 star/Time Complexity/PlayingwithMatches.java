import java.util.*;
public class PlayingwithMatches {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] matches = {6,2,5,5,4,5,6,3,7,6};
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a + b;
            int total = 0;
            String s = String.valueOf(sum);
            for (char c : s.toCharArray()) {
                total += matches[c - '0'];
            }
            System.out.println(total);
        }
    }
}
