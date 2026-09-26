import java.util.*;
public class Carvans {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
           int count = 1; // first car always counts
            int minSpeed = a[0];
            for (int i = 1; i < n; i++) {
                if (a[i] <= minSpeed) {
                    count++;
                    minSpeed = a[i]; // update minimum speed seen so far
                }
            }
            System.out.println(count);
        }
    }
}
