import java.util.*;

public class Palindrome {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        n=sc.nextInt();
        if(isPalindrome(n)){System.out.println("Yes");}
        else{System.out.println("No");}
    }
    public static boolean isPalindrome(int n){
        int rev = 0,temp=n;
        while(n!=0){
            int rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        if (rev==temp){return true;}
        else{return false;}
    }    
}
