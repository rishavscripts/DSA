import java.util.*;
public class CarsAndBikes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            //int cars=n/4;
            int rem=n%4;
            int bike=rem/2;
            if(bike>0){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
