import java.util.*;
public class BadmintonServes {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int p=sc.nextInt();
            if(p%2==0){int ans=p/2+1; System.out.println(ans);}
            else{int ans=(p+1)/2; System.out.println(ans);}
        }
    }
}
