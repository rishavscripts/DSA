import java.util.*;
public class Decrement_Increment {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            if(n%4==0){n++;System.out.println(n);}
            else{n--;System.out.println(n);}
        }
    }
}
