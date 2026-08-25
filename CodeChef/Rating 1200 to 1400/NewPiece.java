import java.util.*;
public class NewPiece {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int p=sc.nextInt();
            int q=sc.nextInt();
            if(a==p&&b==q){System.out.println(0);}
            else if((a+b)%2!=(p+q)%2){System.out.println(1);}
            else{System.out.println(2);}
        }
    }
}
