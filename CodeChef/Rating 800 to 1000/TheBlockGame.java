import java.util.*;
public class TheBlockGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=n;
            int rev=0;
            while(m>0){
                int rem=m%10; rev=rev*10+rem; m/=10;
            }
            if(rev==n){System.out.println("wins");}
            else{System.out.println("loses");}
        }
    }
}
