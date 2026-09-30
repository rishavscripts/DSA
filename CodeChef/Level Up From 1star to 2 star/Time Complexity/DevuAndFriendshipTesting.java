import java.util.*;
public class DevuAndFriendshipTesting {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                int d=sc.nextInt();
                min=Math.min(min,d);
            }
            System.out.println(min);
        }
    }
}
