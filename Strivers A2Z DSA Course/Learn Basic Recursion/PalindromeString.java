import java.util.*;
public class PalindromeString{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        String str = sc.nextLine();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome(String str){
        char ch[] = str.toCharArray();
        int size= ch.length;
        for(int i=0;i<=size/2;i++){
            if(ch[i]!=ch[size-i-1]){return false;}
        }
        return true;
    }
}