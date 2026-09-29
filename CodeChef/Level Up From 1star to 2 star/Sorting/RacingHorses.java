import java.util.*;
public class RacingHorses {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            Arrays.sort(a);
            int min=Integer.MAX_VALUE;
            for(int i=1;i<n;i++){
                int diff=a[i]-a[i-1];
                min=Math.min(min,diff);
            }
            System.out.println(min);
        }
    }
}
