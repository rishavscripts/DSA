import java.util.*;
public class TwoRanges {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();

            int low=Math.min(a,c);
            int high=Math.max(b,d);

            if(c>b){System.out.println(b+d-a-c+2);}
            else{System.out.println(high-low+1);}
        }
    }
}
