import java.util.*;
public class TwoDifferentPalindromes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            
            if(a % 2 == 1 && b % 2 == 1) {
                System.out.println("No");
            } else {
                System.out.println("Yes");
            }
        }
    }
}
