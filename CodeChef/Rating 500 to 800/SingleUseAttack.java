import java.util.Scanner;
public class SingleUseAttack {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int h=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int turn=0;
            h-=y; turn++;
            while(h>0){h-=x;turn++;}
            System.out.println(turn);
        }
    }
}
