import java.util.*;
public class AverageFlex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++){a[i]=sc.nextInt();}
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int i: a){
                map.put(i,map.getOrDefault(i, 0)+1);
            }
            int low=Integer.MAX_VALUE;
            for(int i:map.keySet()){
                low=Math.min(low,i);
            }
            System.out.println(n-map.get(low));
        }
    } 
}
