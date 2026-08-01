import java.util.Scanner;
public class KeplersLaw {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int t1=sc.nextInt();
            int t2=sc.nextInt();
            int r1=sc.nextInt();
            int r2=sc.nextInt();
            double one = (double)(cube(t1))/cube(r1);
            double two = (double)(cube(t2))/cube(r2);
            if(one==two){System.out.println("Yes");}
            else{System.out.println("No");}
        }
    }
    public static int cube(int n){
        return n*n*n;
    }
}
