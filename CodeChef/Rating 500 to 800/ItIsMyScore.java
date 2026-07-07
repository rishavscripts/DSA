import java.util.*;
public class ItIsMyScore {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if((a+b)%4==0 || (a+b)%4==1){
                System.out.println("Alice");
            }
            else{
                System.out.println("Bob");
            }
        }
    }
}
