import java.util.Scanner;
public class TheCoolerDillema {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result = (y - 1) / x;
            System.out.println(result);
        }
    }
}
