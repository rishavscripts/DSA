import java.util.Arrays;
import java.util.Scanner;

public class ValidMinimum {
     static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
    {
        int t = sc.nextInt();
        while(t-- > 0) {
            int[] a = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);
            if(a[0] == a[1]) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
