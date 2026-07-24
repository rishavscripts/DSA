import java.util.*;
public class HighestDivisor {
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        int div=0;
        for(int i=1;i<=10;i++){
            if(n%i==0){div=i;}
        }
        System.out.println(div);
    }
}
