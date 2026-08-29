import java.util.*;
public class TheOnewithRuss {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            int x=sc.nextInt();
            int k=sc.nextInt();
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            for(int i=0;i<n;i++){b[i]=sc.nextInt();}

            int charCount = 0;
            for (int i = 0; i < n; i++) {
                if (Math.abs(a[i] - b[i]) <= k) {
                    charCount++;
                }
            }

            if (charCount >= x) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
