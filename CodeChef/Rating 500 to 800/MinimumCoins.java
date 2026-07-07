import java.util.*;
public class MinimumCoins {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int x=sc.nextInt();
            // Calculation for 10 rupees note.
            int rs10=x/10;
            x%=10;
            // Calculation for 5 rupees note.
            int rs5=x/5;
            x%=5;

            if(x!=0){System.out.println(-1);}
            else{System.out.println(rs10+rs5);}

        }
    }
}
