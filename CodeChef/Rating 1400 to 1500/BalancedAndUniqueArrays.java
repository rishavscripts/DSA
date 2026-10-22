import java.util.*;
public class BalancedAndUniqueArrays {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            if (n % 4 != 0) {System.out.println("NO");}
            else {
                System.out.println("YES");
                int half = n / 2;
                StringBuilder arrayA = new StringBuilder();
                StringBuilder arrayB = new StringBuilder();
                for (int i = 1; i <= half; i += 2) {
                    arrayA.append(i).append(" ");
                    arrayB.append(i + 1).append(" ");
                }
                for (int i = half + 2; i <= n; i += 2) {
                    arrayA.append(i).append(" ");
                    arrayB.append(i - 1).append(" ");
                }
                System.out.println(arrayA.toString().trim());
                System.out.println(arrayB.toString().trim());
            }
        }
    }
}
