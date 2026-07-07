import java.util.*;
public class SugarcaneJuiceBussiness {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            double earn=n*50;
            double less=earn*0.7;
            double profit=earn-less;
            System.out.println((int)profit);
        }
    }
}
