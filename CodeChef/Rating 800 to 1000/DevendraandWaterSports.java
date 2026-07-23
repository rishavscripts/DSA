import java.util.*;
public class DevendraandWaterSports {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int z=sc.nextInt();
            int y=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(z-y>=a+b+c){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
