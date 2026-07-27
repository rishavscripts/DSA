import java.util.*;
public class UtkarshandPlacementTests {
    static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            char[] priority = new char[3];
            for(int i=0;i<3;i++){priority[i]=sc.next().charAt(0);}
            
            char x=sc.next().charAt(0);
            char y=sc.next().charAt(0);

            int x_pos=-1,y_pos=-1;

            for(int i=0;i<3;i++){
                if(priority[i]==x) x_pos=i;
                if(priority[i]==y) y_pos=i;
            }

            if(x_pos<y_pos){System.out.println(x);}
            else{System.out.println(y);}
        }
    }
}
