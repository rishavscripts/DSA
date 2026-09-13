import java.util.*;
public class TakeItEasy {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){arr[i]=sc.nextInt(); sum+=arr[i];}
            if(sum%n!=0){System.out.println("No");}
            else{System.out.println("Yes");}
        }
    }
}
