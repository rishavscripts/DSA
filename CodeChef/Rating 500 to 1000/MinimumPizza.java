import java.util.*;
public class MinimumPizza {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int total=n*x;
            if (total % 4 == 0) System.out.println(total / 4);
            else System.out.println((total / 4) + 1);
        }
    }
}
