import java.util.*;
public class PenaltyShots {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int[] arr= new int[10];
            for(int i=0;i<10;i++){arr[i]=sc.nextInt();}
            int a=arr[0]+arr[2]+arr[4]+arr[6]+arr[8];
            int b=arr[1]+arr[3]+arr[5]+arr[7]+arr[9];
            if(a>b){System.out.println(1);}
            else if(a<b){System.out.println(2);}
            else{System.out.println(0);}
        }
    }
}
