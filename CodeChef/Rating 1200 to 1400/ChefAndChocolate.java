import java.util.*;
public class ChefAndChocolate {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int total=n*m;
            if(total%2==0){System.out.println("Yes");}
            else{System.out.println("No");}
        }
    }
}
