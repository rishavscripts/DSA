import java.util.*;
public class LuckyFour {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.next();
            int count = 0;
            for (char c : s.toCharArray()) {
                if (c == '4') count++;
            }
            System.out.println(count);
    }
}
