import java.util.*;

public class ChefEren {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int a=sc.nextInt();
            int b=sc.nextInt();
            int sum=0;
            for(int j=1;j<=n;j++){
                if(j%2==0){sum+=a;}
                else{sum+=b;}
            }
            System.out.println(sum);
        }
    }
}
