import java.util.*;

public class CheckAlgorithm {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int compressedLength = 0;
            int i = 0;
            while (i < s.length()) {
                char c = s.charAt(i);
                int count = 0;
                while (i < s.length() && s.charAt(i) == c) {
                    count++;
                    i++;
                }
                // add 1 for the character + digits in count
                compressedLength += 1 + String.valueOf(count).length();
            }
            if (compressedLength < s.length()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
