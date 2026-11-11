import java.util.Scanner;

public class CorrectSentence {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int k = scanner.nextInt();
            boolean isValidSentence = true;
            
            for (int i = 0; i < k; i++) {
                String word = scanner.next();
                
                boolean isLang1 = true; // 'a' through 'm'
                boolean isLang2 = true; // 'N' through 'Z'
                
                for (int j = 0; j < word.length(); j++) {
                    char ch = word.charAt(j);
                    
                    if (ch >= 'a' && ch <= 'm') {
                        isLang2 = false;
                    } else if (ch >= 'N' && ch <= 'Z') {
                        isLang1 = false;
                    } else {
                        // Character belongs to neither valid language range
                        isLang1 = false;
                        isLang2 = false;
                    }
                }
                
                // If the word doesn't strictly belong to Language 1 or Language 2
                if (!isLang1 && !isLang2) {
                    isValidSentence = false;
                }
            }
            
            if (isValidSentence) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
