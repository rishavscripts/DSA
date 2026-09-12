import java.util.*;
public class ArrayEquality {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int[] arr= new int[n];
            for(int i=0;i<n;i++){arr[i]=sc.nextInt();}
            HashMap<Integer,Integer> map= new HashMap<>();
            for(int i:arr){
                map.put(i,map.getOrDefault(i, 0)+1);
            }
            int avg=(n+1)/2;
            boolean f=true;
            for(int key:map.keySet()){
                if(map.get(key)>avg) f=false;
            }
            if(f){System.out.println("YES");}
            else{System.out.println("NO");}
        }
    }
}
