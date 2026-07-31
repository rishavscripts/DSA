import java.util.*;
public class JoiningDate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            if(n==k){System.out.println(0);}
            else{
                int terms=n/5;
                System.out.println(terms);
            }
        }
    }
}
