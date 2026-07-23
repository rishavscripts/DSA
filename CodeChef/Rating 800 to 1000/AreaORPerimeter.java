import java.util.*;
public class AreaORPerimeter {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int l=sc.nextInt();
        int b=sc.nextInt();
        int area=l*b;
        int peri=2*(l+b);

        if(area>peri){System.out.println("Area"); System.out.println(area);}
        else if(peri>area){System.out.println("Peri"); System.out.println(peri);}
        else{System.out.println("Eq"); System.out.println(peri);}
    }
}
