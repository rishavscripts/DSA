import java.util.*;
public class CatsAndDogs {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int c=sc.nextInt();
            int d=sc.nextInt();
            int l =sc.nextInt();
            long upper=(c+d)*4;
           
            long lower;
            if(c <= 2*d){
                lower = d * 4;
            } else {
                lower = (c - 2*d) * 4 + d * 4;
            }
            
            if(l % 4 == 0 && l >= lower && l <= upper){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
