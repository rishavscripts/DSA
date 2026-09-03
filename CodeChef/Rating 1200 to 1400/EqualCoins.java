import java.util.*;
public class EqualCoins {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int total=x*1+y*2;
            if(total%2!=0){System.out.println("NO");}
            else{
                if (x == 0 && (y % 2 != 0)) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
        }
    }
}
