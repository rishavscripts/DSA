import java.util.*;

public class ChefChick {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while (t-->0) {
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            int ans=secondLargest(arr, n);
            System.out.println(ans);
        }
    }    
    public static int secondLargest(int[] arr, int n) {
    int max = -1, max2 = -1;
    for (int i : arr) {
        if (i > max) {
            max2 = max;
            max = i;
        } else if (i > max2 && i < max) {
            max2 = i;
        }
    }
    return max2;
}

}
