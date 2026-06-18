import java.util.*;
public class FillCandies{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            double n=sc.nextInt();
            double k=sc.nextInt();
            double m=sc.nextInt();
            double ans=Math.ceil(n/(k*m));
            //int a=ans;
            System.out.println((int)ans);
        }
    }
}