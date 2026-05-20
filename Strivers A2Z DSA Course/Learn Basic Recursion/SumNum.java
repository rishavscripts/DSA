import java.util.*;
public class SumNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int n){
        if(n ==0){return 0;}
        return n+sum(n-1);
    }
}
