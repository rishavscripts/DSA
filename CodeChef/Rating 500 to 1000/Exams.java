import java.util.*;
public class Exams {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            double avg=(double)z/(x*y);
            
            if(avg>0.5){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
