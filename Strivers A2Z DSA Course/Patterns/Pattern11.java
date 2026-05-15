package Patterns;
import java.util.*;
public class Pattern11 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int n;
        System.out.println("Enter the value of n: ");
        n=sc.nextInt();
        pattern11(n);
            }

    public static void pattern11(int n){
        int a[]={0,1};
        int size=a.length,count=0;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(a[count%size]);
                count++;
            }
            System.out.println();
        }
    }
}
