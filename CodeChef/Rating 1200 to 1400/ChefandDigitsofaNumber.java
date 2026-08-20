import java.util.*;
public class ChefandDigitsofaNumber {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr={0,0};
            while(n>0){
                int rem=n%10;
                if(rem==0){arr[0]++;}
                else{arr[1]++;}
                n/=10;
            }
            if(Math.abs(arr[0]-arr[1])==1){System.out.println("Yes");}
            else{System.out.println("No");}
        }
    }
}
