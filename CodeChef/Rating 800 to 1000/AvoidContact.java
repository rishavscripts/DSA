import java.util.*;
public class AvoidContact {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(y==0){System.out.println(x);}
            else if(x==y){System.out.println(2*y-1);}
            else{System.out.println(2*y+(x-y));}
        }
    }
}
