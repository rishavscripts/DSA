import java.util.*;
public class FindTheDirection {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            if(x%4==0){System.out.println("North");}
            else if(x%4==1){System.out.println("East");}
            else if(x%4==2){System.out.println("South");}
            else{System.out.println("West");}
        }
    }
}
