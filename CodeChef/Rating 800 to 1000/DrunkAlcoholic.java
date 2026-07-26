import java.util.*;
public class DrunkAlcoholic {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x%2==0){System.out.println(x);}
            else{System.out.println(x+2);}
        }
    }
}
