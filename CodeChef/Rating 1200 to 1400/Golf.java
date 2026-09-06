import java.util.*;
public class Golf {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int k=sc.nextInt();
            if(n%k==0 || (n-1-x)%k==0){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    } 
}
