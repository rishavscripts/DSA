import java.util.*;
public class AvoidFixedPoints {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int count=0;
            for(int i=0;i<n;i++){if(arr[i]==i+1)count++; i++;}
            System.out.println(count);
        }
    }
}
