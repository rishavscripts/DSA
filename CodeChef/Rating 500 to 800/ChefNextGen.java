import java.util.*;
public class ChefNextGen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int ab=a*b;
            int xy=x*y;
            if(xy>=ab){System.out.println("Yes");}
            else{System.out.println("No");}
        }
    }
}
