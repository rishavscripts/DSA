import java.util.Scanner;
public class BinaryBattles {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int term=(int)Math.round(Math.log(n)/Math.log(2));
            int time= (term*a)+b*(term-1);
            System.out.println(time);
        }
    }
}
