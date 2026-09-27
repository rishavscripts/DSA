import java.util.*;
public class StudyingAlphabet {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s=sc.next();
        int n=sc.nextInt();
        while (n-- > 0) {
            // Checks if the word contains only characters from string s
            System.out.println(sc.next().matches("[" + s + "]+") ? "Yes" : "No");
        }
        
    }
}
