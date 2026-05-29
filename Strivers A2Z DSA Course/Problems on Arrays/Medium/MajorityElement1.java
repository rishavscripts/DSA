import java.util.HashMap;
import java.util.Map;

public class MajorityElement1 {
    public static void main(String[] args){
        int[] arr={1, 1, 1, 2, 1, 2};
        int ans=majority(arr);
        System.out.println(ans);
    }
    public static int majority(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int n:arr){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        int ans=-1;        
        for(int n:map.keySet()){
            if(map.get(n)>(arr.length/2)){ans=n;}
        }
        return ans;
    }
}
