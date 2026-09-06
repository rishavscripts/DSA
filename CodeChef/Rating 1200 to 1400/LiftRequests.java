import java.util.*;
public class LiftRequests {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            //int n=sc.nextInt(); // take as input but not used 
            int q=sc.nextInt();
           
            int current=0,total=0;
            for(int i=0;i<q;i++){
                int f=sc.nextInt();
                int d=sc.nextInt();
                total+=Math.abs(current-f)+Math.abs(f-d);
                current=d;
            }
            System.out.println(total);
        }
    }
}
