import java.util.Scanner;
public class Buy2Get1Free {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int pairs=n/3;
            int rem=n%3;
            int total=pairs*2*x+rem*x;
            System.out.println(total);
        }
    }
}
