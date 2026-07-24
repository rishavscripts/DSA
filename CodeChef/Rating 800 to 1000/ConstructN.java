import java.util.*;
public class ConstructN {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(check(n)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
    public static boolean check(int n){
        if(n%2==0 || n%7==0){return true;}
        int rem=n%7;
        if(rem%2==0){return true;}
        return false;
    }
}
