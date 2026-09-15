import java.util.Scanner;

public class ArchiandComparsion {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long n=sc.nextLong();
            long an=pow(a,n);
            long bn=pow(b,n);
            if(an>bn){System.out.println(1);}
            else if(an<bn){System.out.println(2);}
            else{System.out.println(0);}
        }
    }
    static long pow(long x,long n){
        for(long i=0;i<n;i++){
            x*=x;
        }
        return x;
    }
}
