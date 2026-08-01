import java.util.*;
public class BearAndLadder {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int diff = Math.abs(a - b);
            boolean road = false;
            // Rule 1: consecutive odd-even pair
            if (diff == 1 && Math.min(a, b) % 2 == 1) {
                road = true;
            }
            // Rule 2: consecutive odd numbers
            else if (diff == 2 && a % 2 == 1 && b % 2 == 1) {
                road = true;
            }
            // Rule 3: consecutive even numbers
            else if (diff == 2 && a % 2 == 0 && b % 2 == 0) {
                road = true;
            }
            System.out.println(road ? "YES" : "NO");
        }
    }
}
