import java.util.*;
public class BuildingRace {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            /*double chef=a/x;
            double chefina=b/y;*/
            if (a * y < b * x) {
                    System.out.println("Chef");
                } else if (a * y > b * x) {
                    System.out.println("Chefina");
                } else {
                    System.out.println("Both");
                }
        }
    }
}
