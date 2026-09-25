import java.util.*;
public class ICPCBalloons {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            boolean[] flag = new boolean[7];
            int distinct = 0;
            int count = 0;

            for (int i : arr) {
                if (!flag[i - 1]) {
                    flag[i - 1] = true;
                    distinct++;
                }
                count++;
                if (distinct == 7) break;
            }

            System.out.println(count);
        }
    }
    
}
