import java.util.*;
public class ChefandSubsetAdditions {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int y=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            for(int i=0;i<n;i++){b[i]=sc.nextInt();}
            boolean f=true;
            for(int i=0;i<n;i++){
                int diff=Math.abs(b[i]-a[i]);
                if(diff!=x && diff!=y){ f=false; break;}
            }
            if(f){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
