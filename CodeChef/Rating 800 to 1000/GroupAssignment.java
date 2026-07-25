import java.util.*;
public class GroupAssignment {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int x=sc.nextInt();
            System.out.println(2*n-x+1);
        }
    }
}
