import java.util.*;
public class GreaterAverage{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            double a=sc.nextInt();
            double b=sc.nextInt();
            double c=sc.nextInt();
            if((a+b)/2>c){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}