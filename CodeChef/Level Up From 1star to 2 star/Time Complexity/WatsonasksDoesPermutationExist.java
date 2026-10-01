import java.util.*;
public class WatsonasksDoesPermutationExist {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++) a[i]=sc.nextInt();
            Arrays.sort(a);
            boolean f= true;
            for(int i=1;i<n;i++){if(Math.abs(a[i]-a[i-1])!=1) f=false;}
            if(f){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
