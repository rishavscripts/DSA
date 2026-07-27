import java.util.*;
public class ChefAndProfits {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            System.out.println((z*x)-(x*y));
        }
    }
}
