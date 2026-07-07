import java.util.*;
public class SpeedLimit {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            double a=sc.nextInt();
            double x=sc.nextInt();;
            double b=sc.nextInt();
            double y=sc.nextInt();
            double Alice_speed=a/x;
            double Bob_speed=b/y;
            if(Alice_speed>Bob_speed){System.out.println("Alice");}
            else if(Alice_speed<Bob_speed){System.out.println("Bob");}
            else{System.out.println("Equal");}
        }
    }
}
