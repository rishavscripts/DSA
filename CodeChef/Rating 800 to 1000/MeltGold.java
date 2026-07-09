import java.util.*;
public class MeltGold {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            
            int diff=x-y;
            if(diff==1){System.out.println(1);}
            else{
                int count=0;
                for(int i=0;i<=diff;i++){count++; diff-=i;}
                System.out.println(count);
            }
        }
    }
}
