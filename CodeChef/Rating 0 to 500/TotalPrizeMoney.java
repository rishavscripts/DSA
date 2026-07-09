import java.util.Scanner;
public class TotalPrizeMoney {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int total=(x*10)+(y*90);
            System.out.println(total);
        }
    }
}
