import java.util.*;
public class Weights {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int w=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(w==x || w==y || w==z){System.out.println("YES");}
            else if((x+y)==w || (y+z)==w || (z+x)==w || (x+y+z)==w){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
