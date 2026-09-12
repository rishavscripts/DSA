import java.util.*;
public class BeattheAverage {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt(); // no pf students
            int m=sc.nextInt(); // max score
            int x=sc.nextInt(); // avg score
            if(x>=m){System.out.println(0);}
            else{System.out.println(n-1);}
        }
    }
}
