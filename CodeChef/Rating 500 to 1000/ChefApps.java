import java.util.*;
public class ChefApps {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int s=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            int avail=s-(x+y);
            if(avail>=z){System.out.println(0); }
            else if((avail+x)>=z || (avail+y)>=z){System.out.println(1);}
            else if(avail+(x+y)>=z){System.out.println(2);}
            else{System.out.println(0);}
        }
    }
}
