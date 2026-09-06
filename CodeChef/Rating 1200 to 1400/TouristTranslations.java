import java.util.*;
public class TouristTranslations {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        String m=sc.next();
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < 26; i++) {
            char bytelandChar = (char) ('a' + i);
            char englishChar = m.charAt(i);
            map.put(bytelandChar, englishChar);
            map.put(Character.toUpperCase(bytelandChar), Character.toUpperCase(englishChar));
        }
         for (int i = 0; i < t; i++) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            for (char c : s.toCharArray()) {
                if (map.containsKey(c)) {
                    sb.append(map.get(c));
                } else if (c == '_') {
                    sb.append(' ');
                } else {
                    sb.append(c); // punctuation remains
                }
            }
            System.out.println(sb.toString());
        }
    }
}
