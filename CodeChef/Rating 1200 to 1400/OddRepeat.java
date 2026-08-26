import java.util.*;
public class OddRepeat {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int s=sc.nextInt();
            int ans=(s-(n*n))/(k-1);
            System.out.println(ans);
        }
    }
}
