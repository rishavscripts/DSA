import java.util.*;
public class AirLines {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            int n=sc.nextInt();
            int rem=n-(x*100);
            int need = (int) Math.ceil(rem / 100.0);
            System.out.println(need<0?0:need);
        }
    }
}
