import java.util.*;
public class Cyclic_Quadrilateral{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int d=sc.nextInt();
            if(a+c==180 && b+d==180){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}