import java.util.*;
public class ChefAndPairingSlippers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int l=sc.nextInt();
            int r=n-l;
            int x=sc.nextInt();
            int f=Math.min(l,r);
            System.out.println(f*x);
        }
    }
}
