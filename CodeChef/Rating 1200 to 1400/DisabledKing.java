import java.util.*;
public class DisabledKing {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            if((n-1)%2==0){System.out.println(n-1);}
            else{System.out.println(n);}
        }
    }
}
