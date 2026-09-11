import java.util.*;
public class PlusMultiply {
    static  Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            long answer=pairs(arr,n);
            System.out.println(answer);
        }
    }
    public static long pairs(int[] arr, int n){
        // function is for count the pairs having ai+aj=ai*aj in the array.
        long count=0;
        long count0 = 0, count2 = 0;
        for (int val : arr) {
            if (val == 0) count0++;
            else if (val == 2) count2++;
        }
        count=(count0 * (count0 - 1)) / 2 + (count2 * (count2 - 1)) / 2;
        return count;
    }
}
