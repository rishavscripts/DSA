import java.util.*;
public class PresentsChefina {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int result=(n/5)*4+(n%5);
            System.out.println(result);
        }
    }
}
