import java.util.*;
public class Sumofpalindromicnumbers {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int l=sc.nextInt();
            int r=sc.nextInt();
            int sum=0;
            for(int i=l;i<=r;i++){
                if(isPalindrome(i)) sum+=i;
            }
            System.out.println(sum);
        }
    }
    public static boolean isPalindrome(int n){
        boolean flag=false;
        int t=n,rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        if(t==rev){flag=true;}     
        return flag;
    }
}
