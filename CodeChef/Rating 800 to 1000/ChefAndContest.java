import java.util.*;
public class ChefAndContest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            int chef=x+10*p;
            int chefina=y+q*10;
            if(chef<chefina){System.out.println("Chef");}
            else if(chef>chefina){System.out.println("Chefina");}
            else{System.out.println("Draw");}
        }
    }
}
