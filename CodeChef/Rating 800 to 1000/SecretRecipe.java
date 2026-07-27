import java.util.*;
public class SecretRecipe {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int x3=sc.nextInt();
            int v1=sc.nextInt();
            int v2=sc.nextInt();
            int dis_Chef=Math.abs(x1-x3);
            int dis_Kefa=Math.abs(x2-x3);
            double chef=dis_Chef/v1;
            double kefa=dis_Kefa/v2;
            if(chef<kefa){System.out.println("Chef");}
            else if(chef<kefa){System.out.println("Kefa");}
            else{System.out.println("Draw");}
        }
    }
}
