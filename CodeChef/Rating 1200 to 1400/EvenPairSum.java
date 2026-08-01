import java.util.Scanner;
public class EvenPairSum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int a_even=even(a);
            int a_odd=odd(a);
            int b_even=even(b);
            int b_odd=odd(b);
            int ans=(a_even*b_even)+(a_odd*b_odd);
            System.out.println(ans);
        }
    }
    public static int even(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%2==0) count++;
        }
        return count;
    }
    public static int odd(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0) count++;
        }
        return count;
    }
}
