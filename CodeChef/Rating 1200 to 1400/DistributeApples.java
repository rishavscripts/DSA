import java.util.*;
public class DistributeApples {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(k==1 || n==k){System.out.println("NO");}
            else{System.out.println("YES");}
        }
    }
}
