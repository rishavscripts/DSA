import  java.util.*;
public class DeputyChef {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] d=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            for(int i=0;i<n;i++){d[i]=sc.nextInt();}

            int best = -1;
            for(int i = 0; i < n; i++){
                int left = (i - 1 + n) % n;
                int right = (i + 1) % n;
                if(d[i] > a[left] + a[right]){
                    best = Math.max(best, d[i]);
                }
            }
            System.out.println(best);
        }
    }
}
