import java.util.Scanner;
public class EqualizingNumbers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int diff=(int)Math.abs(a-b);
            if(diff%2==0 || a==b){System.out.println("Yes");}
            else{System.out.println("No");}
        }
    }
}
