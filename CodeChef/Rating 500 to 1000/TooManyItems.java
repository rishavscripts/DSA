import java.util.*;

public class TooManyItems {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n%10==0){System.out.println((int)(n/10));}
            else{{System.out.println((int)(n/10)+1);}}
        }
    }    
}
