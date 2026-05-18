import java.util.*;
public class Reverse {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n ;
        n=sc.nextInt();
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        int rev=0;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}
