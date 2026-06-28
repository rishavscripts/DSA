import java.util.*;
public class Factorial {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            System.out.printf("%.0f",fact(n));
            System.out.println();
        }
    }    
    public static int fact(int n){
        if(n==0 || n==1)return 1;
        else return n*fact(n-1);
    }
}
