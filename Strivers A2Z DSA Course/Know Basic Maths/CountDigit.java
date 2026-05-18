import java.util.*;
public class CountDigit {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n ;
        n=sc.nextInt();
        System.out.println(countDigit(n));
    }
    public static int countDigit(int n){
        int count =0;
        if(n==0) return 1;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}
