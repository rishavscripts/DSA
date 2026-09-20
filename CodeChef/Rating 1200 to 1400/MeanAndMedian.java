import java.util.*;
public class MeanAndMedian {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] arr=new int[3];
            arr[1]=y;
            int sum=x*3;
            int sum2=sum-y;
            if(sum2%2==0){arr[0]=sum2/2; arr[2]=sum2/2;}
            else{arr[0]=sum2/2; arr[2]=sum2/2+1;}
            for(int n:arr){System.out.print(n+" ");}
            System.out.println();
        }
    }
}
