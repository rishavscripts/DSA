import java.util.*;
public class PeacefulParty {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if(a+c>b){System.out.println(a+c);}
            else{System.out.println(b);}
        }
    }
}
