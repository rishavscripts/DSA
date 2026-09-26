import java.util.*;
public class NobelPrize {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            Set<Integer> set= new HashSet<>();
            for(int i:a){set.add(i);}
            if(set.size()==m){System.out.println("No");}
            else{System.out.println("Yes");}
        }
    }
}
