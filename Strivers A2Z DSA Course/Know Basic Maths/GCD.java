import java.util.*;
public class GCD {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("GCD: "+gcd(a,b));
    }
    public static int gcd(int a, int b){
        int var ,gcd=1;
        if(b>=a){var=a;}
        else{var=b;}
        for(int i=2;i<=var;i++){
            if(a%i==0 && b%i==0){gcd=i;}
        }
        return gcd;
    }
}
