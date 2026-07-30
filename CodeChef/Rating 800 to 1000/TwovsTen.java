import java.util.*;
public class TwovsTen {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            System.out.println(turns(x));
        }
    }
    public static int turns(int x){
        if(x%10==0)return 0;
        if(x%2!=0 && x%5!=0){return -1;} 
        else if(x%2!=0 && x%5==0){return 1;}
        else{
            int turn=0;
            while(true){
                x*=2;
                turn++;
                if(x%10==0){break;}
            }
            return turn;
        }
    }
}
