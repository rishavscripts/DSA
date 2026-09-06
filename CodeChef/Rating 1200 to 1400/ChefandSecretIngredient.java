import java.util.*;
public class ChefandSecretIngredient {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int x=sc.nextInt();
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            boolean f=false;
            for(int a:arr){
                if(a>=x) {f=true; break;}
            }
            if(f) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
