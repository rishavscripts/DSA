import java.util.*;
public class Armstrong {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
    }
    public static int digits(int n){
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        return count;
    }
    public static int power(int base,int exp){
        int ans=1;
        for(int i=1;i<=exp;i++){ans*=base;}
        return ans;
    }
    public static boolean isArmstrong(int n){
        int digits=digits(n);
        int sum=0,temp=n;
        while(n!=0){
            int rem=n%10;
            sum+=power(rem,digits);
            n/=10;
        }
        return sum==temp;
    }
}
