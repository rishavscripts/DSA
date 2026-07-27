import java.util.*;
public class PassingMarks {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int amin=sc.nextInt();
            int bmin=sc.nextInt();
            int cmin=sc.nextInt();
            int tmin=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            if(a>=amin && b>=bmin && c>=cmin && a+b+c>=tmin){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
