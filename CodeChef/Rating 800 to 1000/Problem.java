import java.util.*;
public class Problem {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            if(check(n,m)){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
    public static boolean check(int n, int m){
        if(n==m) return true;
        int t=(n+m)/2;
        int a=Math.max(n,m)+1;
        int b=a;
        for(int i=1;i<=t;i++){
            for(int j=1;j<=t;j++){
                if(i+2*j==t){a=i;b=j;}
            }
        }
        if(a+2*b==t)return true;
        else return false;
    }
}
