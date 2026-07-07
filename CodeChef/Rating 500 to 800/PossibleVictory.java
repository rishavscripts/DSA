import java.util.*;
public class PossibleVictory {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int r=sc.nextInt();
        int o=sc.nextInt();
        int c=sc.nextInt();
        int left_overs=20-o;
        int poss_runs=left_overs*36;
        if(c+poss_runs>r){System.out.println("YES");}
        else{System.out.println("NO");}
    }
}
