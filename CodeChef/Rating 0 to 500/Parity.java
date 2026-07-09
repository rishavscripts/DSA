import java.util.*;
public class Parity {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            if(n%2==0){System.out.println("Yes");}
            else{System.out.println("No");}
        }
    }
}
