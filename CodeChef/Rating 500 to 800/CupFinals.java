import java.util.*;
public class CupFinals {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int d=sc.nextInt();
            int diff=(x>y)?(x-y):(y-x);
            if(diff<=d){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
