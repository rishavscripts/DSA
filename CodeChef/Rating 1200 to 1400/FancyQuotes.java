import java.util.*;

public class FancyQuotes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
        while (t-- > 0) {
            String s = sc.nextLine(); // read full sentence
            String[] words = s.split(" ");
            boolean found = false;
            for (String w : words) {
                if (w.equals("not")) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println("Real Fancy");
            } else {
                System.out.println("regularly fancy");
            }
        }
    }
}
