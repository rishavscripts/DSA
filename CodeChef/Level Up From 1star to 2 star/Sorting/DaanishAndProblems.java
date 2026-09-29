import java.util.*;
public class DaanishAndProblems {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int[] A=new int[10];
            for(int i=0;i<10;i++){A[i]=sc.nextInt();}
            int K=sc.nextInt();
           int ans = 1;
            for (int i = 10; i >= 1; i--) {
                if (K >= A[i]) {
                    K -= A[i]; // remove all problems of this difficulty
                } else {
                    ans = i; // cannot remove all, so this is max difficulty
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
