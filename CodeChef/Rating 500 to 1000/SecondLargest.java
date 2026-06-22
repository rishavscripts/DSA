import java.util.*;
public class SecondLargest {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            if((a>b&&a<c)||(a<b&&a>c)){System.out.println(a);}
            else if((b>a&&b<c)||(b<a&&b>c)){System.out.println(b);}
            else{System.out.println(c);}
        }
    }
}
