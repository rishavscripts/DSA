import java.util.*;
public class CredCoins {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            if(x*y<100){System.out.println(0);}
            else{System.out.println((x*y)/100);}
        }
    }
}
