import java.util.*;
public class ToDivideorNotToDivide {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int n=sc.nextInt();
            if(a%b==0){System.out.println(-1);}
            else{
                int start=((n+a-1)/a)*a;
                while(true){
                    if(start%b!=0) {System.out.println(start); break;}
                    else{start+=a;}
                }
            }
        }
    }
}
