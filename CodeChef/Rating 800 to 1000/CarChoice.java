import java.util.*;
public class CarChoice {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x1=sc.nextInt();
            int x2=sc.nextInt();
            int y1=sc.nextInt();
            int y2=sc.nextInt();

            double first=y1/x1;
            double second=y2/x2;
            if(first>second){System.out.println(1);}
            else if(second>first){System.out.println(-1);}
            else{System.out.println(0);}
        }
    }
}
