import java.util.*;

public class SingleOperationPart1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int y = sc.nextInt();
            String s = sc.next();
            
            String prefix = s.substring(0, s.length() - y);
            String suffix = s.substring(s.length() - y);
            
            int prefixVal = prefix.isEmpty() ? 0 : Integer.parseInt(prefix, 2);
            int suffixVal = Integer.parseInt(suffix, 2);
            
            int result = prefixVal ^ suffixVal;
            System.out.println(result);
        }
    }
}
/*
You’re given a binary string s and an integer y.

Split the string into:

Prefix → the first len(s) - y bits

Suffix → the last y bits

Convert both parts into integers.

Perform XOR between prefix and suffix.

Print the result.
 */