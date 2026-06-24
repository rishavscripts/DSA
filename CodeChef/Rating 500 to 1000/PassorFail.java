import java.util.*;
public class PassorFail{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int x=sc.nextInt(); // Rightly answered
            int p=sc.nextInt();
            int y=(n-x);    // Wrongly answered
            int score=(x*3)+(y*-1);
            if(score>=p){System.out.println("PASS");}
            else{{System.out.println("FAIL");}}
        }
    }
}