import java.util.*;
public class NahaaneJaa {
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            boolean flag=false;
            for(int i:arr){if(i==k) flag=true;}
            if(flag){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
