import java.util.*;
public class ChefOperators {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a<b){System.out.println("<");}
            else if(a>b){System.out.println(">");}
            else{System.out.println("=");}
        }   
    }
}
