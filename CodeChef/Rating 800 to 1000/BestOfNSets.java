import java.util.*;
public class BestOfNSets {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int ans=2*Math.max(x,y)-1;
            System.out.println(ans);
        }
    }
}
