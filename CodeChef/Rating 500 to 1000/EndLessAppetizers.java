import java.util.*;

public class EndLessAppetizers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int r=sc.nextInt();
            int extra=r/30;
            int eaten=x+extra;
            /*int ans=(eaten%y==0)?(eaten/y):(eaten/y+1);
            if(eaten<y){System.out.println(0);}
            else{System.out.println(ans);}*/
            System.out.println((eaten + y - 1) / y);
        }
    }    
}
