import java.util.*;
public class WhichDivision {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int  t=sc.nextInt();
        while(t-->0){
            int r=sc.nextInt();
            if(r>=2000){System.out.println(1);}
            else if(r>=1600 && r<2000){System.out.println(2);}
            else{System.out.println(3);}
        }
    }
}
