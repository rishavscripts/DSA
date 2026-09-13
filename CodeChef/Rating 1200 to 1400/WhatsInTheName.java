import java.util.*;

public class WhatsInTheName {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        sc.nextLine(); // consume newline
        while (t-- > 0) {
            String s = sc.nextLine();
            String[] words = s.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length - 1; i++) {
                char initial = Character.toUpperCase(words[i].charAt(0));
                result.append(initial).append(". ");
            }

            String last = words[words.length - 1];
            result.append(Character.toUpperCase(last.charAt(0)))
                  .append(last.substring(1).toLowerCase());

            System.out.println(result.toString());
        }
    }
}
