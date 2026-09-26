import java.util.*;
public class HardCash {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            long sum=0;
            for(int i=0;i<n;i++){
                sum+=sc.nextLong();
            }
            System.out.println(sum%k);
        }
    }
}
