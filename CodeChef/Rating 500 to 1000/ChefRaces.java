import java.util.*;
public class ChefRaces{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
           int match = 0;
            if (x == a || x == b) match++;
            if (y == a || y == b) match++;
            System.out.println(2 - match);
        }
    }
}