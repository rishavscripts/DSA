import java.util.*;
public class ChefAndPriceControl {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int sum1=0,sum2=0;
            for(int i=0;i<n;i++){
                int tp=sc.nextInt();
                sum1+=tp;
                if(tp<k)sum2+=tp;
                else sum2+=k;
            }
            System.out.println(Math.abs(sum1-sum2));
        }
    }
}
