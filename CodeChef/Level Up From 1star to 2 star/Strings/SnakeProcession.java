import java.util.*;

public class SnakeProcession {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int r = sc.nextInt();
        while (r-- > 0) {
            //int l = sc.nextInt();
            String s = sc.next();
            boolean expectTail = false;
            boolean valid = true;
            
            for (char c : s.toCharArray()) {
                if (c == 'H') {
                    if (expectTail) { // already waiting for a tail
                        valid = false;
                        break;
                    }
                    expectTail = true;
                } else if (c == 'T') {
                    if (!expectTail) { // tail without head
                        valid = false;
                        break;
                    }
                    expectTail = false;
                }
                // '.' is ignored
            }
            
            if (expectTail) valid = false; // unmatched head at end
            
            System.out.println(valid ? "Valid" : "Invalid");
        }
    }
}
