import java.util.*;
public class CountingPrettyNumbers {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            int count=0;
            for(int i=l;i<=r;i++){
                if(i%10==2 || i%10==3 || i%10==9){count++;}
            }
            System.out.println(count);
        }
    }
}
