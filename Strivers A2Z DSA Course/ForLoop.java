import java.util.*;
public class ForLoop {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int high, low;
        System.out.println("Enter the lower bound: ");
        low = sc.nextInt();
        System.out.println("Enter the upper bound: ");
        high = sc.nextInt();
        For_Loop(low,high);
    }
    public static void For_Loop(int low, int high){
        int i,sum=0;
        for (i=low;i<=high;i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}
