import java.util.*;
public class ChefOnIsland {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int xr=sc.nextInt();
            int yr=sc.nextInt();
            int d=sc.nextInt();
            double food=x/xr;
            double water=y/yr;
            if(Math.min(food,water)<d){System.out.println("NO");}
            else{System.out.println("YES");}
        }
    }
}
